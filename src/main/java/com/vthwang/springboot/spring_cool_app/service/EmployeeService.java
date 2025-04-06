package com.vthwang.springboot.spring_cool_app.service;

import java.util.List;

import com.vthwang.springboot.spring_cool_app.entity.Employee;

public interface EmployeeService {
    List<Employee> findAll();
    void save(Employee theEmployee);
    Employee findById(int theId);
}
