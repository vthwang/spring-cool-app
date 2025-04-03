package com.vthwang.springboot.spring_cool_app;

import java.util.List;

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
			// createStudent(studentDAO);

			// createMultipleStudents(studentDAO);

			// readStudent(studentDAO);

			// queryStudents(studentDAO);

			queryStudentsByLastName(studentDAO);
		};
	}

	// private void createStudent(StudentDAO studentDAO) {
	// System.out.println("Creating student object...");
	// Student tempStudent = new Student("John", "Doe", "john.doe@gmail.com");
	// studentDAO.save(tempStudent);
	// System.out.println("Saved student. Generated id: " + tempStudent.getId());
	// }

	// private void createMultipleStudents(StudentDAO studentDAO) {
	// System.out.println("Creating 3 student objects...");
	// Student tempStudent1 = new Student("John", "Doe", "john.doe@gmail.com");
	// Student tempStudent2 = new Student("Mary", "Public",
	// "mary.public@gmail.com");
	// Student tempStudent3 = new Student("Bonita", "Applebum",
	// "bonita.applebum@gmail.com");

	// studentDAO.save(tempStudent1);
	// studentDAO.save(tempStudent2);
	// studentDAO.save(tempStudent3);

	// System.out.println("Saved students. Generated id: " + tempStudent1.getId());
	// }

	// private void readStudent(StudentDAO studentDAO) {
	// System.out.println("Creating student object...");
	// Student tempStudent = new Student("Daffy", "Duck", "daffy.duck@gmail.com");
	// studentDAO.save(tempStudent);
	// System.out.println("Saved student. Generated id: " + tempStudent.getId());

	// System.out.println("Retrieving student with id: " + tempStudent.getId());
	// Student myStudent = studentDAO.findById(tempStudent.getId());
	// System.out.println("Found the student: " + myStudent);
	// }

	// private void queryStudents(StudentDAO studentDAO) {
	// 	List<Student> theStudents = studentDAO.findAll();
	// 	for (Student tempStudent : theStudents) {
	// 		System.out.println(tempStudent);
	// 	}
	// }

	private void queryStudentsByLastName(StudentDAO studentDAO) {
		List<Student> theStudents = studentDAO.findByLastName("Doe");
		for (Student tempStudent : theStudents) {
			System.out.println(tempStudent);
		}
	}
}