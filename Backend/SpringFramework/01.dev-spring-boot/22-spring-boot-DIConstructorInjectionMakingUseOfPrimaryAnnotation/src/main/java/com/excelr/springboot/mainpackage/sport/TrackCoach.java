package com.excelr.springboot.mainpackage.sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class TrackCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "Run a hard 5k";
    }
}
