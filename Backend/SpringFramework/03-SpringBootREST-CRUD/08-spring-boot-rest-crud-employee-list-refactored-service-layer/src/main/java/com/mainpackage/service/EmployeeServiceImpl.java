package com.mainpackage.service;

import com.mainpackage.dao.EmployeeDAO;
import com.mainpackage.entity.Employee;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
    private EmployeeDAO employeeDAO;


    public EmployeeServiceImpl(EmployeeDAO employeeDAO)
    {
        this.employeeDAO = employeeDAO;
    }

    @Override
    public List<Employee> findAll()
    {
        return employeeDAO.findAll();
    }
}
