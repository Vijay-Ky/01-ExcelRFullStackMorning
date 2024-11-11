package com.excelr.mainpackage.dao;

import com.excelr.mainpackage.entity.Student;

import java.util.List;

public interface StudentDAO
{
    List<Student> findByLastName(String theLastName);
}
