package com.excelr.springboot.mainpackage.restController;

import com.excelr.springboot.mainpackage.sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestControllerProgram
{
    private Coach myCoach;


    @Autowired
    public void setRestControllerProgram(@Qualifier("cricketCoach") Coach theCoach)
    {
        myCoach = theCoach;
    }

    @GetMapping("/myworkout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
