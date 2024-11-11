package com.mainpackage.dao;

import com.mainpackage.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();
}
