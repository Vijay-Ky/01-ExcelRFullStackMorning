package com.mainpackage.rest;

import com.mainpackage.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController
{
    private List<Student> theStudents;


    //define @PostConstruct to load the student data ... only once!
    //This is much better since we load student data only once
    //@PostConstruct is an annotation from the Java Persistence API (JPA) that is used in Spring (including Spring Boot) to indicate a method that should be executed after a bean has been constructed and initialized.
    @PostConstruct
    public void loadData()
    {
       theStudents = new ArrayList<Student>();

        theStudents.add(new Student("Poornima", "Patel"));
        theStudents.add(new Student("Mario", "Rossi"));
        theStudents.add(new Student("Mary", "Smith"));
        theStudents.add(new Student());
    }

    // define endpoint for "/students" - return a list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return theStudents;
    }


    // define endpoint or "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudent(@PathVariable int studentId) {

        // just index into the list ... keep it simple for now

        return theStudents.get(studentId);
    }
}
