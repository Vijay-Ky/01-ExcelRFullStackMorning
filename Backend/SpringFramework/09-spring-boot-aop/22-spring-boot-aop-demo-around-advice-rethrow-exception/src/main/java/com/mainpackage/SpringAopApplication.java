package com.mainpackage;

import com.mainpackage.dao.AccountDAO;
import com.mainpackage.dao.MembershipDAO;
import com.mainpackage.demo.AccountDAODemo;
import com.mainpackage.demo.MembershipDAODemo;
import com.mainpackage.service.TrafficFortuneService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.util.List;

@SpringBootApplication
public class SpringAopApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Bean
	public CommandLineRunner commandLineRunner(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO, TrafficFortuneService theTrafficFortuneService)
	{
		return runner -> {

//			demoTheBeforeAdvice(theAccountDAO, theMembershipDAO, theAccountDAODemo, theMembershipDAODemo);
			//demoTheAfterReturningAdvice(theAccountDAO);
			//demoTheAfterAdvice(theAccountDAO);
			//demoTheAroundAdvice(theTrafficFortuneService);
			//demoTheAroundAdviceHandleException(theTrafficFortuneService);

			demoTheAroundAdviceRethrowException(theTrafficFortuneService);
		};
	}
	private void demoTheAroundAdviceRethrowException(TrafficFortuneService theTrafficFortuneService)
	{
		System.out.println("\nMain Program: demoTheAroundAdviceRethrowException");

		System.out.println("Calling getFortune()");

		boolean tripWire = true;
		String data = theTrafficFortuneService.getFortune(tripWire);

		System.out.println("\nMy fortune is: " + data);

		System.out.println("Finished");
	}

	private void demoTheAroundAdviceHandleException(TrafficFortuneService theTrafficFortuneService) {

		System.out.println("\nMain Program: demoTheAroundAdviceHandleException");

		System.out.println("Calling getFortune()");

		boolean tripWire = true;
		String data = theTrafficFortuneService.getFortune(tripWire);

		System.out.println("\nMy fortune is: " + data);

		System.out.println("Finished");
	}

	//before and after the advice
	private void demoTheAroundAdvice(TrafficFortuneService theTrafficFortuneService)
	{
		System.out.println("\nMain Program: demoTheAroundAdvice");

		System.out.println("Calling getFortune()");

		String data = theTrafficFortuneService.getFortune();

		System.out.println("\nMy fortune is: " + data);

		System.out.println("Finished");
	}

	private void demoTheAfterAdvice(AccountDAO theAccountDAO) {

		// call method to find the accounts
		List<Account> theAccounts = null;

		try {
			// add a boolean flag to simulate exceptions
			boolean tripWire = true;
			theAccounts = theAccountDAO.findAccounts(tripWire);
		}
		catch (Exception exc) {
			System.out.println("\n\nMain Program: ... caught exception: " + exc);
		}

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterAdvice");
		System.out.println("----");

		System.out.println(theAccounts);

		System.out.println("\n");
	}

	private void demoTheAfterReturningAdvice(AccountDAO theAccountDAO)
	{
		// call method to find the accounts
		List<Account> theAccounts = theAccountDAO.findAccounts();

		// display the accounts
		System.out.println("\n\nMain Program: demoTheAfterReturningAdvice");
		System.out.println("----");

		System.out.println(theAccounts);

		System.out.println("\n");
	}


	private void demoTheBeforeAdvice(AccountDAO theAccountDAO, MembershipDAO theMembershipDAO, AccountDAODemo theAccountDAODemo, MembershipDAODemo theMembershipDAODemo) {

		// call the business method
		Account myAccount = new Account();
		theAccountDAO.addAccount(myAccount, true);
		theAccountDAO.doWork();

		// call the accountdao getter/setter methods
		theAccountDAO.setName("vijay");
		theAccountDAO.setServiceCode("training");

		String name = theAccountDAO.getName();
		String code = theAccountDAO.getServiceCode();

		// call the membership business method
		theMembershipDAO.addSillyMember();
		theMembershipDAO.goToSleep();

		System.out.println("---------------------------");
		System.out.println("---------------------------");

		// call the business method
		Account myAccountdemo = new Account();
		theAccountDAODemo.addAccount(myAccountdemo, true);
		theAccountDAODemo.doWork();

		// call the membership business method
		theMembershipDAODemo.addSillyMember();
		theMembershipDAODemo.goToSleep();

	}
}
