package com.vthwang.springboot.spring_cool_app.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.vthwang.springboot.spring_cool_app.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    
}
