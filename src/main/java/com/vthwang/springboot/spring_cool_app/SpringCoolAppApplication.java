package com.vthwang.springboot.spring_cool_app;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.vthwang.springboot.spring_cool_app.dao.StudentDAO;
import com.vthwang.springboot.spring_cool_app.entity.Student;

@SpringBootApplication
public class SpringCoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoolAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO) {
		return runner -> {
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO) {
		System.out.println("Creating student object...");
		Student tempStudent = new Student("John", "Doe", "john.doe@gmail.com");
		studentDAO.save(tempStudent);
		System.out.println("Saved student. Generated id: " + tempStudent.getId());
	}
}
