package com.vthwang.springboot.spring_cool_app.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.vthwang.springboot.spring_cool_app.common.Coach;
import com.vthwang.springboot.spring_cool_app.common.SwimCoach;

@Configuration
public class SportConfig {

    @Bean("aquatic")
    public Coach swimCoach() {
        return new SwimCoach();
    }
}
