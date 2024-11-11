package com.excelr.mainpackage;

import com.excelr.mainpackage.dao.StudentDAO;
import com.excelr.mainpackage.entity.Student;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class SpringDataJpa {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringDataJpa.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(StudentDAO studentDAO)
	{
		return runner -> {
			updateStudent(studentDAO);
		};
	}

	private void updateStudent(StudentDAO studentDAO) {

		// retrieve student based on the id: primary key
		int studentId = 1;
		System.out.println("Getting student with id: " + studentId);
		Student myStudent = studentDAO.findById(studentId);
		System.out.println("Got the id with: " + myStudent);

		// change first name to "John"
		System.out.println("Updating student ...");
		myStudent.setFirstName("David");

		// update the student
		studentDAO.update(myStudent);

		// display the updated student
		System.out.println("Updated student: " + myStudent);
	}

}
