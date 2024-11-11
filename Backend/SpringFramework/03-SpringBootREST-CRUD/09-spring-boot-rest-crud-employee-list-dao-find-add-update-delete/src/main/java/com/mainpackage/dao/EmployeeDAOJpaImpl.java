package com.mainpackage.dao;

import com.mainpackage.entity.Employee;
import jakarta.persistence.EntityManager;
import jakarta.persistence.TypedQuery;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class EmployeeDAOJpaImpl implements EmployeeDAO
{

    //define field for entityManager
    private EntityManager entityManager;

    //set up constructor injection
    @Autowired
    public EmployeeDAOJpaImpl(EntityManager theEntityManager)
    {
        this.entityManager = theEntityManager;
    }

    @Override
    public List<Employee> findAll()
    {
        //create a query
        TypedQuery<Employee> theQuery = entityManager.createQuery("from Employee", Employee.class);

        //execute query and get result list
        List<Employee> employees = theQuery.getResultList();

        //return the result
        return employees;
    }

    @Override
    public Employee findById(int employeeId)
    {
        //get employee
        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        //return employee
        return theEmployee;
    }

    //we don't use @Transactional at the DAO layer bcz it will be handled at service layer
    @Override
    public Employee save(Employee theEmployee)
    {
        //In spring boot, entityManager.merge() is a method provided by JPA for managing entities in a database
        //if the id is not matching with any of the existing entity in the database insert operation will happen.
        //if the ID of an entity is set to 0 or null, then JPA will consider it as a new entity and insert it into the database.
        //if the ID is set to non-zero value that already exists in the database, calling merge method will update the existing entity with the state of the provided entity.
        Employee dbEmployee = entityManager.merge(theEmployee);


        return dbEmployee;
    }

    @Override
    public void deleteById(int employeeId)
    {
        Employee theEmployee = entityManager.find(Employee.class, employeeId);

        //remove employee
        entityManager.remove(theEmployee);
    }
}
