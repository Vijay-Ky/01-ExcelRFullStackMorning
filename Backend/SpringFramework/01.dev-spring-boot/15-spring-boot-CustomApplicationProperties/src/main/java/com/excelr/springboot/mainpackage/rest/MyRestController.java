package com.excelr.springboot.mainpackage.rest;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyRestController
{
    @Value("${trainer.name}")
    private String trainerName;

    @Value("${course.name}")
    private String courseName;

    @Value("${institute.name}")
    private String instituteName;

    @Value("${course.duration}")
    private String courseDuration;

    @GetMapping("/ApplicationInfo")
    public String getInfo()
    {
        return "<br> Trainer Name :: " + trainerName + "<br> Course Name :: " + courseName +
                "<br> Institute Name :: " + instituteName + "<br> Course Duration :: " + courseDuration;
    }
}
