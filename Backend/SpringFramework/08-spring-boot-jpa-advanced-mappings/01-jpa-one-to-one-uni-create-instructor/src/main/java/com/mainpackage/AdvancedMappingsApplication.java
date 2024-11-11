package com.mainpackage;

import com.mainpackage.dao.AppDAO;
import com.mainpackage.entity.Instructor;
import com.mainpackage.entity.InstructorDetail;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class AdvancedMappingsApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(AdvancedMappingsApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AppDAO appDAO) {

		return runner -> {
			createInstructor(appDAO);
		};
	}

	private void createInstructor(AppDAO appDAO)
	{

		/*
		// create the instructor
		Instructor tempInstructor =
				new Instructor("Madhu", "Patel", "madhu@email.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.youtube.com/madhu",
						"Guitar");
						*/
		// create the instructor
		Instructor tempInstructor =
				new Instructor("Vijay", "Kumar", "vijay@email.com");

		// create the instructor detail
		InstructorDetail tempInstructorDetail =
				new InstructorDetail(
						"http://www.youtube.com/vijay",
						"Coding");

		// associate the objects
		tempInstructor.setInstructorDetail(tempInstructorDetail);

		// save the instructor
		//
		// NOTE: this will ALSO save the details object
		// because of CascadeType.ALL
		//
		System.out.println("Saving instructor: " + tempInstructor);
		appDAO.save(tempInstructor);

		System.out.println("Done!");
	}
}
