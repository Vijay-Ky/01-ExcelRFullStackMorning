package com.mainpackage;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


@SpringBootApplication
public class MainSpringBootApplication
{
	public static void main(String[] args)
	{
		SpringApplication.run(MainSpringBootApplication.class, args);
	}
}
/*
Restrict Access Based on Roles
----------------------
HTTP Method 	Endpoint 			CRUD Action 	Role
GET 	/api/employees 				Read all 		EMPLOYEE
GET 	/api/employees/{employeeId} Read single 	EMPLOYEE
POST 	/api/employees 				Create 			MANAGER
PUT 	/api/employees 				Update 			MANAGER
DELETE 	/api/employees/{employeeId} Delete employee ADMIN

Spring Boot REST API Security
------------------------------
You will learn how to …
• Secure Spring Boot REST APIs
• Define users and roles
• Protect URLs based on role
• Store users, passwords and roles in DB (plain-text -> encrypted)

Spring Security Model
• Spring Security defines a framework for security
• Implemented using Servlet filters in the background
• Two methods of securing an app: declarative and programmatic

Spring Security with Servlet Filters
• Servlet Filters are used to pre-process / post-process web requests
• Servlet Filters can route web requests based on security logic
• Spring provides a bulk of security functionality with servlet filters


Security Concepts
• Authentication
• Check user id and password with credentials stored in app / db
• Authorization
• Check to see if user has an authorized role

Declarative Security
• Define application’s security constraints in configuration
• All Java config: @Configuration
• Provides separation of concerns between application code and security

Programmatic Security
• Spring Security provides an API for custom application coding
• Provides greater customization for specific app requirements

Enabling Spring Security
1. Edit pom.xml and add spring-boot-starter-security

<dependency>
<groupId>org.springframework.boot</groupId>
<artifactId>spring-boot-starter-security</artifactId>
</dependency>

2.This will automagically secure all endpoints for application


Authentication and Authorization
-----------
In-memory
• JDBC
• LDAP
• Custom / Pluggable
• others …
We will cover password storage in DB as plain-text AND encrypted


Configuring Basic Security
-----------
Our Users
-------
User ID Password Roles
john test123 EMPLOYEE
mary test123 EMPLOYEE, MANAGER
susan test123 EMPLOYEE, MANAGER, ADMIN
-We can give ANY names for user roles

Spring Security Password Storage
• In Spring Security, passwords are stored using a specific format
{id}encodedPassword

ID Description
noop Plain text passwords
bcrypt BCrypt password hashing

*/
