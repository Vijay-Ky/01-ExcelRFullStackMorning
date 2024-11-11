package com.mainpackage.dao;

import com.mainpackage.entity.Course;
import com.mainpackage.entity.Instructor;
import com.mainpackage.entity.InstructorDetail;

import java.util.List;

public interface AppDAO
{
    void save(Instructor theInstructor);

    Instructor findInstructorById(int theId);

    void deleteInstructorById(int theId);

    InstructorDetail findInstructorDetailById(int theId);

    void deleteInstructorDetailById(int theId);

    List<Course> findCoursesByInstructorId(int theId);
}