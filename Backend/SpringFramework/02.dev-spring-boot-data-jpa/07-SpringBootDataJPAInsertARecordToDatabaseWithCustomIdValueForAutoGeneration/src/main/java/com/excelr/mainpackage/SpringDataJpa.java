package com.excelr.mainpackage;

import com.excelr.mainpackage.dao.StudentDAO;
import com.excelr.mainpackage.entity.Student;
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
			createStudent(studentDAO);
		};
	}

	private void createStudent(StudentDAO studentDAO)
	{
		//create the student objects
		System.out.println("Creating new student object ...");
		Student tempStudent1 = new Student("John", "Doe", "john@vijaysprogramming.com");
		Student tempStudent2 = new Student("Tom", "Cruise", "tom@vijaysprogramming.com");

		//save the student objects
		System.out.println("Saving student object ...");
		studentDAO.save(tempStudent1);
		studentDAO.save(tempStudent2);

		//display id of the saved student
		System.out.println("Saved student, Generated ID: " + tempStudent1.getId());
		System.out.println("Saved student, Generated ID: " + tempStudent2.getId());
	}
}

/*
* To set the Auto_increment to start from a different value
* - Go to sql workbench and trigger ALTER TABLE student_tracker.student AUTO_INCREMENT = 100;
* - To start from 0 trigger this command in MySQL workbench  TRUNCATE TABLE STUDENT;
* - if you do the DELETE then AUTO_INCREMENT will be not be reset
* - If you TRUNCATE a table which contains AUTO_INCREMENT, the AUTO_INCREMENT value will be reset to 0. This is because the TRUNCATE TABLE statement completely removes the table's data, including the AUTO_INCREMENT value.
* - Do the Truncate using this command TRUNCATE TABLE STUDENT;
* difference between TRUNCATE and DELETE in MySQL in simple words:

TRUNCATE is a DDL (Data Definition Language) statement that removes all rows from a table. It does not allow you to specify a WHERE clause, so you cannot delete specific records from the table. The TRUNCATE statement is faster than the DELETE statement when deleting all records from a table.
DELETE is a DML (Data Manipulation Language) statement that allows you to delete one or more rows from a table. You can use a WHERE clause to specify which records you want to delete. The DELETE statement is slower than the TRUNCATE statement when deleting all records from a table, but it allows you to delete specific records.
* Feature										 					TRUNCATE	DELETE
Data Definition Language (DDL) or Data Manipulation Language (DML)	  DDL			DML
Allows WHERE clause													  No	       Yes
Faster																  Yes	        No
Can be rolled back													  No			Yes
*
* */
