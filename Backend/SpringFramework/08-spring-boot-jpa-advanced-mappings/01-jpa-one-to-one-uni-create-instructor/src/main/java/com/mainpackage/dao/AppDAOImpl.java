package com.mainpackage.dao;

import com.mainpackage.entity.Instructor;
import jakarta.persistence.EntityManager;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

@Repository
public class AppDAOImpl implements AppDAO
{
    // define field for entity manager
    private EntityManager entityManager;

    public AppDAOImpl(EntityManager entityManager)
    {
        this.entityManager = entityManager;
    }

    @Override
    @Transactional
    public void save(Instructor theInstructor)
    {
        entityManager.persist(theInstructor);
    }
}