package in.vijaysprogramming.springboot.springbootAddignDevToolAutoDependency;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AddignDevToolAutoDependencyWhileCreatingProjectApplication {

	public static void main(String[] args)
	{
		SpringApplication.run(AddignDevToolAutoDependencyWhileCreatingProjectApplication.class, args);
		System.out.println("Adding SpringBoot DevTool dependency in the pom file manually");
	}

}
