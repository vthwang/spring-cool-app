package com.vthwang.springboot.spring_cool_app.dao;

import java.util.List;

import com.vthwang.springboot.spring_cool_app.entity.Student;

public interface StudentDAO {
    void save(Student student);
    List<Student> findAll();
}
