package in.vijaysprogramming.springboot.springbootPrintSomethingToTheConsole;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application
{
	public static void main(String[] args)
	{
		System.out.println("This is the output from Spring Application: " + 1);
		SpringApplication.run(Application.class, args);
		System.out.println("This is the output from Spring Application: " + 2);
	}
}
