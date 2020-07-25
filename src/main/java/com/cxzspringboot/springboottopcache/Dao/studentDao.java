package com.cxzspringboot.springboottopcache.Dao;

import com.cxzspringboot.springboottopcache.bean.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface studentDao {

    int update(Student student);

    int insert(Student student);

    int delete(Long id);

    Student selectById(Long id);

    List<Student> selectAll();

    List<Student> search(String query);

}
