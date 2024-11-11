package com.excelr.springboot.anotherRest;

import com.excelr.springboot.mainpackage.sport.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AnotherRest
{
    private Coach myCoach;
    public AnotherRest()
    {
        System.out.println("From constructor: " + getClass().getName());
    }

    @Autowired
    public AnotherRest(@Qualifier("cricketCoach") Coach theCoach)
    {
        myCoach = theCoach;
        System.out.println("from constructor AnotherRest theCoach value " + myCoach );
    }

    @GetMapping("/myanotherworkout")
    public String getAvailableDailyWorkout()
    {
        return myCoach.getDailyWorkout();
    }
}
