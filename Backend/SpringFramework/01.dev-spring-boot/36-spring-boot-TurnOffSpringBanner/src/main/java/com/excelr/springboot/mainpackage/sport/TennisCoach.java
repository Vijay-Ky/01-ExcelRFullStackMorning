package com.excelr.springboot.mainpackage.sport;

import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;

public class TennisCoach implements Coach
{
    public TennisCoach()
    {
        System.out.println("From constructor: " + getClass().getName());
    }
    //define our init method
    @PostConstruct
    public void doMyStartupStuff()
    {
        System.out.println("from doMyStartupStuff(): " + getClass().getSimpleName());
    }

    //define our destroy method
    @PreDestroy
    public void doMyCleanupStuff()
    {
        System.out.println("from doMyCleanupStuff(): " + getClass().getSimpleName());
    }
    @Override
    public String getDailyWorkout()
    {
        return "Practice smash for 50min";
    }
}
