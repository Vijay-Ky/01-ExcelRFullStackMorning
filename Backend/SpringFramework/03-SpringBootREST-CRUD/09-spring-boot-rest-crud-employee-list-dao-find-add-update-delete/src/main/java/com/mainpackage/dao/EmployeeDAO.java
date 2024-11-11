package com.mainpackage.dao;

import com.mainpackage.entity.Employee;

import java.util.List;

public interface EmployeeDAO
{
    List<Employee> findAll();

    Employee findById(int employeeId);

    Employee save(Employee theEmployee);

    void deleteById(int employeeId);
}
