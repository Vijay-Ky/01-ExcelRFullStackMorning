package com.excelr.springboot.mainpackage.restController;

import com.excelr.springboot.mainpackage.sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram2
{
    private Coach myCoach;

    public RestControllerProgram2()
    {
        System.out.println("RestControllerProgram2");
    }

    @Autowired
    public RestControllerProgram2(@Qualifier("trackCoach") Coach theCoach)
    {
        myCoach = theCoach;
        System.out.println("from constructor RestControllerProgram theCoach value " + myCoach );
    }

    @GetMapping("/myrest2workout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
