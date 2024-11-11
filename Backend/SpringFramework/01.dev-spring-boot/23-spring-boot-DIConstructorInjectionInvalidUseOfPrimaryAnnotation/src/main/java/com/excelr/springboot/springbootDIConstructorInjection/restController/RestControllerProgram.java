package com.excelr.springboot.springbootDIConstructorInjection.restController;

import com.excelr.springboot.springbootDIConstructorInjection.sport.Coach;
import com.excelr.springboot.springbootDIConstructorInjection.sport.CricketCoach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;


    @Autowired
    public RestControllerProgram( Coach theCoach)
    {
        myCoach = theCoach;
        System.out.println("from constructor RestControllerProgram theCoach value " + myCoach );
    }

    @GetMapping("/myworkout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
