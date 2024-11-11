DROP USER if exists 'springstudent'@'%';

CREATE USER 'springstudent'@'%' IDENTIFIED BY 'springstudent';

GRANT ALL PRIVILEGES ON * . * TO 'springstudent'@'%';

CREATE DATABASE IF NOT EXISTS student_tracker;
USE student_tracker;

CREATE TABLE student (
   id int NOT NULL AUTO_INCREMENT,
   first_name varchar(45) DEFAULT NULL,
   last_name varchar(45) DEFAULT NULL,
   email varchar(45) DEFAULT NULL,
  PRIMARY KEY (id)
) ENGINE=InnoDB AUTO_INCREMENT=1 DEFAULT CHARSET=latin1;


