package com.vthwang.springboot.spring_cool_app.dao;

import com.vthwang.springboot.spring_cool_app.entity.Instructor;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int theId);
}
