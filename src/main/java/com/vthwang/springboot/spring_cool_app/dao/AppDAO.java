package com.vthwang.springboot.spring_cool_app.dao;

import com.vthwang.springboot.spring_cool_app.entity.Instructor;
import com.vthwang.springboot.spring_cool_app.entity.InstructorDetail;
import com.vthwang.springboot.spring_cool_app.entity.Course;
import java.util.List;

public interface AppDAO {
    void save(Instructor instructor);
    Instructor findInstructorById(int theId);
    void deleteInstructorById(int theId);
    InstructorDetail findInstructorDetailById(int theId);
    void deleteInstructorDetailById(int theId);
    List<Course> findCoursesByInstructorId(int theId);
}
