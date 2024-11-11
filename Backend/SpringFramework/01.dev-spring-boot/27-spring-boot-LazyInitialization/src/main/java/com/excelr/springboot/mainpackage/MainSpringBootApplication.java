package com.excelr.springboot.mainpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//@SpringBootApplication(scanBasePackages = {"com.excelr.springboot.springbootDIConstructorInjection", "com.excelr.springboot.util", "com.excelr.springboot.anotherRest"})
@SpringBootApplication//(scanBasePackages = {"com.excelr.springboot.anotherRest", "com.excelr.springboot.util", "com.excelr.springboot.springbootDIConstructorInjection"})

public class MainSpringBootApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MainSpringBootApplication.class, args);
	}
}
