package com.excelr.springboot.util;

import com.excelr.springboot.mainpackage.sport.Coach;
import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;


@Component
@Lazy
public class SwimCoach implements Coach
{
    public SwimCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }
    public String getDailyWorkout()
    {
        return "SwimCoach: swim for 100 meters";
    }
}
