package com.mainpackage.controller;

import com.mainpackage.entity.Employee;
import com.mainpackage.service.EmployeeService;
import jakarta.annotation.PostConstruct;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController
{
    private EmployeeService employeeService;

    public EmployeeController(EmployeeService theEmployeeService)
    {
        this.employeeService = theEmployeeService;
    }

    //add mapping for "/list"
    @GetMapping("/list")
    public String listEmployees(Model theModel)
    {
        //get the employees from db
        List<Employee> theEmployees = employeeService.findAll();

        //add to the spring model
        theModel.addAttribute("employees", theEmployees);

        return "list-employees";
    }
}
