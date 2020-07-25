package com.cxzspringboot.springboottopcache.controller;

import com.cxzspringboot.springboottopcache.bean.Student;
import com.cxzspringboot.springboottopcache.service.studentService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class StudentController {

    @Autowired
    private studentService service;

    ///表格显示
    @GetMapping("/index")
    public String index(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum,
                        Model model){
        PageHelper.startPage(pagenum,5);
        List<Student> studentList = service.selectAll();
        ///得到分页结果
        PageInfo pageInfo = new PageInfo(studentList);
        model.addAttribute("pageInfo",pageInfo);
        return "index";
    }

    ///载入新增页面
    @GetMapping("/input")
    public String input(Model model){
        model.addAttribute("stu",new Student());
        return "insert";
    }

    ///载入修改页面
    @GetMapping("/input/{id}")
    public String editInput(@PathVariable Long id,Model model){
        model.addAttribute("stu",service.selectById(id));
        return "insert";
    }

    @PostMapping("/postInput")
    public String postInput(Student student){
        Long id = student.getStudentId();
        System.out.println(id);
        if(id != null){
            service.update(student);
        }else{
            service.insert(student);
        }
        return "redirect:/index";
    }

    @GetMapping("/delete/{id}")
    public String delete(@PathVariable Long id){
        service.delete(id);
        return "redirect:/index";
    }

    /**
     * 单页面实现查询返回数据，并且分页功能也无异常
     * @param query
     * @return
     */
    @PostMapping("/search")
    public String search(String query){
        return "forward:/search/"+query;
    }

    @RequestMapping("/search/{query}")
    public String searchPage(@RequestParam(required = false,defaultValue = "1",value = "pagenum")int pagenum,
                             @PathVariable String query, Model model){
        PageHelper.startPage(pagenum,3);
        List<Student> students = service.search(query);
        PageInfo pageInfo = new PageInfo(students);
        model.addAttribute("pageInfo",pageInfo);
        model.addAttribute("query",query);
        return "index";
    }
    /**
     * 两个方法结合实现
     */

}
