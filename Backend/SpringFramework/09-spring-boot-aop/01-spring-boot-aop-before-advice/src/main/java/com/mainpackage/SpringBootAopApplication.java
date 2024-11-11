package com.mainpackage;

import com.mainpackage.dao.AccountDAO;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class SpringBootAopApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(SpringBootAopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO) {

		return runner -> {

			demoTheBeforeAdvice(theAccountDAO);
		};
	}

	private void demoTheBeforeAdvice(AccountDAO theAccountDAO) {

		// call the business method
		theAccountDAO.addAccount();

		// do it again!
		System.out.println("\n let's call it again!\n");

		// call the business method again
		theAccountDAO.addAccount();
	}
}
