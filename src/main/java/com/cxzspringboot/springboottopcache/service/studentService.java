package com.cxzspringboot.springboottopcache.service;

import com.cxzspringboot.springboottopcache.bean.Student;

import java.sql.SQLException;
import java.util.List;

public interface studentService {

    int update(Student student);

    int insert(Student student);

    int delete(Long id);

    List<Student> selectAll();

    Student selectById(Long id);

    List<Student> search(String query);
}
