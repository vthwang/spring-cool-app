package com.vthwang.springboot.spring_cool_app.dao;

import java.util.List;

import com.vthwang.springboot.spring_cool_app.entity.Student;

public interface StudentDAO {
    void save(Student student);
    Student findById(Integer id);
    List<Student> findAll();
    List<Student> findByLastName(String theLastName);
    void update(Student student);
    void delete(Integer id);
    int deleteAll();
}
