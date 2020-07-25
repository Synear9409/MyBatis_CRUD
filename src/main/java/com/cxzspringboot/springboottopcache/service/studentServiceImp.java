package com.cxzspringboot.springboottopcache.service;
import com.cxzspringboot.springboottopcache.Dao.studentDao;
import com.cxzspringboot.springboottopcache.bean.Student;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class studentServiceImp implements studentService {

    @Autowired
    private studentDao studentDao;

    @Override
    public int update(Student student) {
        return studentDao.update(student);
    }

    @Override
    public int insert(Student student) {
        return studentDao.insert(student);
    }

    @Override
    public int delete(Long id) {
        return studentDao.delete(id);
    }

    @Override
    public List<Student> selectAll() {
        return studentDao.selectAll();
    }

    @Override
    public Student selectById(Long id) {
        return studentDao.selectById(id);
    }

    @Override
    public List<Student> search(String query) {
        return studentDao.search(query);
    }
}
