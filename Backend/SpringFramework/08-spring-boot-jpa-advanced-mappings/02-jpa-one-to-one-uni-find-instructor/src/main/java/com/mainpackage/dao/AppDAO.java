package com.mainpackage.dao;

import com.mainpackage.entity.Instructor;

public interface AppDAO
{
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);
}
