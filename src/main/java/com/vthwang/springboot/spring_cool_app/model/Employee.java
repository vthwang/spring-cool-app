package com.vthwang.springboot.spring_cool_app.model;

public class Employee {
    private int id;
    private String firstName;
    private String lastName;
    private String email;

    public Employee() {
        
    }

    public Employee(String firstName, String lastName, String email) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
    }   

    public int getId() {
        return id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee {id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", email=" + email + "}";
    }
}