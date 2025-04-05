package com.vthwang.springboot.spring_cool_app.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import javax.sql.DataSource;

@Configuration
public class DemoSecurityConfig {
    // @Bean
    // public InMemoryUserDetailsManager userDetailsManager() {
    //     UserDetails john = User.builder()
    //         .username("john")
    //         .password("{noop}test123")
    //         .roles("EMPLOYEE", "ADMIN")
    //         .build();

    //     UserDetails mary = User.builder()
    //         .username("mary")
    //         .password("{noop}test123")
    //         .roles("EMPLOYEE", "MANAGER")
    //         .build();

    //     UserDetails susan = User.builder()
    //         .username("susan")
    //         .password("{noop}test123")
    //         .roles("EMPLOYEE", "MANAGER", "ADMIN")
    //         .build();

    //     return new InMemoryUserDetailsManager(john, mary, susan);
    // }

    @Bean
    public UserDetailsManager userDetailsManager(DataSource dataSource) {
        return new JdbcUserDetailsManager(dataSource);
    }

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http.authorizeHttpRequests(configurer ->
            configurer
                .requestMatchers(HttpMethod.GET, "/api/employees").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole("EMPLOYEE")
                .requestMatchers(HttpMethod.POST, "/api/employees").hasRole("MANAGER")
                .requestMatchers(HttpMethod.PUT, "/api/employees/**").hasRole("MANAGER")
                .requestMatchers(HttpMethod.PATCH, "/api/employees/**").hasRole("MANAGER")
                .requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole("ADMIN")
        );

        // use HTTP Basic authentication
        http.httpBasic(Customizer.withDefaults());

        // disable CSRF
        http.csrf(csrf -> csrf.disable());

        return http.build();
    }
}
