package com.mainpackage.rest;

import com.mainpackage.entity.Employee;
import com.mainpackage.service.EmployeeService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
public class EmployeeRestController
{
    private EmployeeService employeeService;

    //quick way to inject employee DAO(using the constructor injection

    public EmployeeRestController(EmployeeService employeeService)
    {
        this.employeeService = employeeService;
    }

    //expose "/employees" and return a list of employees
    @GetMapping("/employees")
    public List<Employee> findAll()
    {
        return employeeService.findAll();
    }

    @GetMapping("employees/{employeeId}")
    public Employee getEmployee(@PathVariable int employeeId)
    {
        Employee theEmployee = employeeService.findById(employeeId);

        if (theEmployee == null)
        {
            throw new RuntimeException("Employee id not found - " + employeeId);
        }

        return theEmployee;
    }

    @PostMapping("/employee")
    public Employee addEmployee(@RequestBody Employee theEmployee)
    {
        theEmployee.setId(0);
        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

    // add mapping for PUT /employees - update existing employee
    //for updating, go to postman and change the request to PUT, body, raw, json

    @PutMapping("/employee")
    public Employee updateEmployee(@RequestBody Employee theEmployee) {

        Employee dbEmployee = employeeService.save(theEmployee);

        return dbEmployee;
    }

}
