package com.excelr.springboot.mainpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {"com.excelr.springboot.springbootDIConstructorInjection", "com.excelr.springboot.util"})

public class MainSpringBootApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MainSpringBootApplication.class, args);
	}
}
