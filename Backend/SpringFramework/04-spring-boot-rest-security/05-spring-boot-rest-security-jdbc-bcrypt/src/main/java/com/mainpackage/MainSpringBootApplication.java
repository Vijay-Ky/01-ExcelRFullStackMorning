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
for generating hash password

https://www.bcryptcalculator.com/

Spring security user Accounts stored in the database
-----------------------------------------------
Database Access
• So far, our user accounts were hard coded in Java source code
• We want to add database access

-------------------------

Recall Our User Roles
User ID Password Roles
john test123 EMPLOYEE
mary test123 EMPLOYEE, MANAGER
susan test123 EMPLOYEE, MANAGER, ADMIN

---------------------------------

Database Support in Spring Security
• Spring Security can read user account info from database
• By default, you have to follow Spring Security’s predefined table schemas

-------------------------------

Customize Database Access with Spring Security
• Can also customize the table schemas
• Useful if you have custom tables specific to your project / custom
• You will be responsible for developing the code to access the data
• JDBC, JPA/Hibernate etc

------------------------------------

Database Support in Spring Security
• Follow Spring Security’s predefined table schemas

spring security -> JDBC code -> database

-------------------

Development Process
1. Develop SQL Script to set up database tables
2. Add database support to Maven POM file
3.Create JDBC properties file
4. Update Spring Security Configuration to use JDBC

------------------------------------

To generate database diagram in mysql(ER diagram)
-------------------------

Database -> Reverse Engineer -> choose your connection -> login -> hit continue -> select database schema -> hit continue -> continue again -> make sure items are checked -> execute -> again hit continue -> close

------------------------------------
USE `employee_directory`;

DROP TABLE IF EXISTS `authorities`;
DROP TABLE IF EXISTS `users`;

--
-- Table structure for table `users`
--

CREATE TABLE `users` (
  `username` varchar(50) NOT NULL,
  `password` varchar(50) NOT NULL,
  `enabled` tinyint NOT NULL,
  PRIMARY KEY (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `users`
--

-- {noop} -> the encoding algorithm id, test123 -> password
-- letting spring security know passwords are stored as plain text(noop)
INSERT INTO `users`
VALUES
('john','{noop}test123',1),
('mary','{noop}test123',1),
('susan','{noop}test123',1);


--
-- Table structure for table `authorities`
-- authorities same as roles
-- internally spring security uses "ROLE_" prefix

CREATE TABLE `authorities` (
  `username` varchar(50) NOT NULL,
  `authority` varchar(50) NOT NULL,
  UNIQUE KEY `authorities_idx_1` (`username`,`authority`),
  CONSTRAINT `authorities_ibfk_1` FOREIGN KEY (`username`) REFERENCES `users` (`username`)
) ENGINE=InnoDB DEFAULT CHARSET=latin1;

--
-- Inserting data for table `authorities`
--

INSERT INTO `authorities`
VALUES
('john','ROLE_EMPLOYEE'),
('mary','ROLE_EMPLOYEE'),
('mary','ROLE_MANAGER'),
('susan','ROLE_EMPLOYEE'),
('susan','ROLE_MANAGER'),
('susan','ROLE_ADMIN');


--------------------------------------

*/
