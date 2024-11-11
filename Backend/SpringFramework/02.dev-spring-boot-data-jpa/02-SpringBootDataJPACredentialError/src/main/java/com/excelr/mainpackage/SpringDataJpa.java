package com.excelr.mainpackage;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

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
			createMultipleStudents(studentDAO);
		};
	}

	private void createMultipleStudents(StudentDAO studentDAO)
	{
		//create the student objects
		System.out.println("Creating Multiple student objects ...");
		Student tempStudent1 = new Student("Aditi", "Sharma", "aditi@vijaysprogramming.com");
		Student tempStudent2 = new Student("Maya", "Arora", "maya@vijaysprogramming.com");
		Student tempStudent3 = new Student("Neha", "Patel", "neha@vijaysprogramming.com");

		//save the student object
		System.out.println("Saving student objects ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);
		studentDAO.save(tempStudent3);


		//display id of the saved student
		System.out.println("Saved!  Generated ID: " + tempStudent1.getId());
		System.out.println("Saved!  Generated ID: " + tempStudent2.getId());
		System.out.println("Saved!  Generated ID: " + tempStudent3.getId());
	}
}
