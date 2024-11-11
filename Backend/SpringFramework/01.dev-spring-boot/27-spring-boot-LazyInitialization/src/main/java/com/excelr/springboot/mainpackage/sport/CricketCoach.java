package com.excelr.springboot.mainpackage.sport;

import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
@Lazy
public class CricketCoach implements Coach
{
    public CricketCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 30 minutes";
    }
}
