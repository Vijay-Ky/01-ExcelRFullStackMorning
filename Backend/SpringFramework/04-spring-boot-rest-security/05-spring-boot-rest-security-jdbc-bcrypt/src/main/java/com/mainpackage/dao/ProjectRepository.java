package com.mainpackage.dao;

import com.mainpackage.entity.Employee;
import com.mainpackage.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path="member1")
interface StudentRepository extends JpaRepository<Student, Integer>
{
    //no need to write any code, it will be taken care by the JpaRepository
}

@RepositoryRestResource(path="member2")
interface EmployeeRepository extends JpaRepository<Employee, Integer>
{
    //no need to write any code, it will be taken care by the JpaRepository
}


