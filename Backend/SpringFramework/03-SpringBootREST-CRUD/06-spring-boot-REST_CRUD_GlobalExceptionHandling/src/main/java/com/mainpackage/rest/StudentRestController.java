package com.mainpackage.rest;

import com.mainpackage.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

//    //Add an exception handler using @ExceptionHandler
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(StudentNotFoundException ex)
//    {
//        //create a StudentErrorResponse
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.NOT_FOUND.value());
//        error.setMessage(ex.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        //return ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
//    }
//
//    //add another exception handler to catch any exception (catch all)
//    //we can add any no. of exception handler
//
//    @ExceptionHandler
//    public ResponseEntity<StudentErrorResponse> handleException(Exception ex)
//    {
//        //create a StudentErrorResponse
//        StudentErrorResponse error = new StudentErrorResponse();
//
//        error.setStatus(HttpStatus.BAD_REQUEST.value());
//        error.setMessage(ex.getMessage());
//        error.setTimeStamp(System.currentTimeMillis());
//
//        //return ResponseEntity
//        return new ResponseEntity<>(error, HttpStatus.BAD_REQUEST);
//    }
}
