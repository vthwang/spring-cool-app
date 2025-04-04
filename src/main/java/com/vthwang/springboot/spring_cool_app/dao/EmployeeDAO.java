package com.vthwang.springboot.spring_cool_app.dao;

import java.util.List;

import com.vthwang.springboot.spring_cool_app.entity.Employee;

public interface EmployeeDAO {
    List<Employee> findAll();
    Employee findById(int theId);
    Employee save(Employee theEmployee);
    void deleteById(int theId);
}
