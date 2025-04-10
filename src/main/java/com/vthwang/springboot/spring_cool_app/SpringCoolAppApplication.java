package com.vthwang.springboot.spring_cool_app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.boot.CommandLineRunner;
import com.vthwang.springboot.spring_cool_app.dao.AppDAO;
import com.vthwang.springboot.spring_cool_app.entity.Instructor;
import com.vthwang.springboot.spring_cool_app.entity.Course;
import java.util.List;

@SpringBootApplication
public class SpringCoolAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringCoolAppApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {
		return runner -> {
			findInstructorByIdJoinFetch(appDAO);

			// findCoursesForInstructor(appDAO);

			// fetchInstructorWithCourses(appDAO);

			// createInstructorWithCourses(appDAO);

			// deleteInstructorDetail(appDAO);

			// findInstructorDetail(appDAO);

			// deleteInstructor(appDAO);

			// findInstructor(appDAO);

			// createInstructor(appDAO);

			// createStudent(studentDAO);

			// createMultipleStudents(studentDAO);

			// readStudent(studentDAO);

			// queryStudents(studentDAO);

			// queryStudentsByLastName(studentDAO);

			// updateStudent(studentDAO);

			// deleteStudent(studentDAO);

			// deleteAllStudents(studentDAO);
		};
	}

	private void findInstructorByIdJoinFetch(AppDAO appDAO) {
		int theId = 2;
		System.out.println("Fetching instructor with id: " + theId);
		Instructor tempInstructor = appDAO.findInstructorByIdJoinFetch(theId);
		System.out.println("Instructor: " + tempInstructor);
		System.out.println("Courses: " + tempInstructor.getCourses());
	}

	// private void findCoursesForInstructor(AppDAO appDAO) {
	// 	int theId = 2;
	// 	System.out.println("Fetching instructor with id: " + theId);
	// 	Instructor tempInstructor = appDAO.findInstructorById(theId);
	// 	System.out.println("Instructor: " + tempInstructor);
	// 	List<Course> courses = appDAO.findCoursesByInstructorId(theId);
	// 	tempInstructor.setCourses(courses);

	// 	System.out.println("Courses: " + tempInstructor.getCourses());
	// }

	// private void fetchInstructorWithCourses(AppDAO appDAO) {
	// 	int theId = 1;
	// 	System.out.println("Fetching instructor with id: " + theId);
	// 	Instructor tempInstructor = appDAO.findInstructorById(theId);
	// 	System.out.println("Instructor: " + tempInstructor);
	// 	System.out.println("Courses: " + tempInstructor.getCourses());
	// }

	// private void createInstructorWithCourses(AppDAO appDAO) {
	// 	Instructor tempInstructor = new Instructor("John", "Doe", "john.doe@gmail.com");
	// 	InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Luv 2 code!!!");
	// 	tempInstructor.setInstructorDetail(tempInstructorDetail);

	// 	Course tempCourse1 = new Course("Air Guitar - The Ultimate Guide");
	// 	Course tempCourse2 = new Course("The Pinball Masterclass");

	// 	tempInstructor.add(tempCourse1);
	// 	tempInstructor.add(tempCourse2);

	// 	System.out.println("Saving the instructor: " + tempInstructor);
	// 	System.out.println("Saved courses: " + tempInstructor.getCourses());

	// 	appDAO.save(tempInstructor);
	// }

	// private void deleteInstructorDetail(AppDAO appDAO) {
	// 	int theId = 3;
	// 	System.out.println("Deleting instructor detail id: " + theId);
	// 	appDAO.deleteInstructorDetailById(theId);
	// 	System.out.println("Deleted instructor detail. Success!");
	// }

	// private void findInstructorDetail(AppDAO appDAO) {
	// 	int theId = 1;
	// 	InstructorDetail tempInstructorDetail = appDAO.findInstructorDetailById(theId);
	// 	System.out.println("Temp instructor detail: " + tempInstructorDetail);
	// 	System.out.println("The associated instructor: " + tempInstructorDetail.getInstructor());
	// }

	// private void deleteInstructor(AppDAO appDAO) {
	// 	int theId = 2;
	// 	System.out.println("Deleting instructor id: " + theId);
	// 	appDAO.deleteInstructorById(theId);
	// 	System.out.println("Deleted instructor. Success!");
	// }

	// private void findInstructor(AppDAO appDAO) {
	// 	Instructor tempInstructor = appDAO.findInstructorById(2);
	// 	System.out.println("Temp instructor: " + tempInstructor);
	// 	System.out.println("The associated instructor detail: " + tempInstructor.getInstructorDetail());
	// }

	// private void createInstructor(AppDAO appDAO) {
	// 	Instructor tempInstructor = new Instructor("Chad", "Darby", "darby@luv2code.com");
	// 	InstructorDetail tempInstructorDetail = new InstructorDetail("http://www.luv2code.com/youtube", "Luv 2 code!!!");
	// 	tempInstructor.setInstructorDetail(tempInstructorDetail);
	// 	appDAO.save(tempInstructor);
	// }

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
	// List<Student> theStudents = studentDAO.findAll();
	// for (Student tempStudent : theStudents) {
	// System.out.println(tempStudent);
	// }
	// }

	// private void queryStudentsByLastName(StudentDAO studentDAO) {
	// List<Student> theStudents = studentDAO.findByLastName("Doe");
	// for (Student tempStudent : theStudents) {
	// System.out.println(tempStudent);
	// }
	// }

	// private void updateStudent(StudentDAO studentDAO) {
	// int studentId = 1;
	// System.out.println("Getting student with id: " + studentId);
	// Student myStudent = studentDAO.findById(studentId);
	// System.out.println("Updating student...");
	// myStudent.setFirstName("Scooby");
	// studentDAO.update(myStudent);
	// System.out.println("Updated student: " + myStudent);
	// }

	// private void deleteStudent(StudentDAO studentDAO) {
	// int studentId = 1;
	// System.out.println("Deleting student with id: " + studentId);
	// studentDAO.delete(studentId);
	// }

	// private void deleteAllStudents(StudentDAO studentDAO) {
	// System.out.println("Deleting all students");
	// int numRowsDeleted = studentDAO.deleteAll();
	// System.out.println("Number of rows deleted: " + numRowsDeleted);
	// }
}