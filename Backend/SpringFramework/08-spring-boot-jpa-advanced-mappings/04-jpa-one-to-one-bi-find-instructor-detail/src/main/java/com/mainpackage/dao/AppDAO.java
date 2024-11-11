package com.mainpackage.dao;

import com.mainpackage.entity.Instructor;
import com.mainpackage.entity.InstructorDetail;

public interface AppDAO
{
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);
}
