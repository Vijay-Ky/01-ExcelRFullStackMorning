package com.mainpackage.service;

import com.mainpackage.entity.Employee;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Service;
import jakarta.persistence.TypedQuery;

import java.util.List;

@Service
public class EmployeeServiceImpl implements EmployeeService
{
   // define field for entitymanager
    private EntityManager entityManager;

    public EmployeeServiceImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    public List<Employee> findAll()
    {
        // create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        // execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        // return the results
        return employees;
    }

    @Override
    public Employee findById(int theId) {

        // get employee
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // return employee
        return theEmployee;
    }

    @Override
    public Employee save(Employee theEmployee) {

        // save employee
        Employee dbEmployee = entityManager.merge(theEmployee);

        // return the dbEmployee
        return dbEmployee;
    }

    @Override
    public void deleteById(int theId) {

        // find employee by id
        Employee theEmployee = entityManager.find(Employee.class, theId);

        // remove employee
        entityManager.remove(theEmployee);
    }
}
