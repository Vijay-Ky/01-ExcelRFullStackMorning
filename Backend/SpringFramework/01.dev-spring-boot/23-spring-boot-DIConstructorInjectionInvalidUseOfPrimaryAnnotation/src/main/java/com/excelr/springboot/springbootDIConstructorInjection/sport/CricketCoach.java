package com.excelr.springboot.springbootDIConstructorInjection.sport;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class CricketCoach implements Coach
{
    @Override
    public String getDailyWorkout()
    {
        return "CricketCoach: Practice batting for 30 minutes";
    }
}
