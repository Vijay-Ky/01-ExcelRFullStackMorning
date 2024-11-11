package com.excelr.springboot.mainpackage.sport;

import org.springframework.context.annotation.Lazy;
import org.springframework.stereotype.Component;

@Component
public class TrackCoach implements Coach
{
    public TrackCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }
}
