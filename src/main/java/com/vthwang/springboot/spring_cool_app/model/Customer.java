package com.vthwang.springboot.spring_cool_app.model;

import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

public class Customer {
    private String firstName;
    
    @NotNull(message = "is required")
    @Size(min = 1, message = "is required")
    private String lastName = "";

    public String getFirstName() {  
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
