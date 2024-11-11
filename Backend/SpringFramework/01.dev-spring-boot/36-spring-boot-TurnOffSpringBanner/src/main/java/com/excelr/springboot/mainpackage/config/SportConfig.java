package com.excelr.springboot.mainpackage.config;

import com.excelr.springboot.mainpackage.sport.Coach;
import com.excelr.springboot.mainpackage.sport.TennisCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig
{
    @Bean("tennisConfiguration")
    public Coach tennisCoach()
    {
        return new TennisCoach();
    }
}
