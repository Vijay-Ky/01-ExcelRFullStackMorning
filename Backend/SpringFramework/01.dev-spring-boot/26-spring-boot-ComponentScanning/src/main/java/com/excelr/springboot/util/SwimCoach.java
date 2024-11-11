package com.excelr.springboot.util;

import com.excelr.springboot.mainpackage.sport.Coach;
import org.springframework.stereotype.Component;


@Component
public class SwimCoach implements Coach
{
    public String getDailyWorkout()
    {
        return "SwimCoach: swim for 100 meters";
    }
}
