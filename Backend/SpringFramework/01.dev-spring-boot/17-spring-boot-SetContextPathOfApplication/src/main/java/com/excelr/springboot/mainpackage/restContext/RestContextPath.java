package com.excelr.springboot.mainpackage.restContext;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestContextPath
{
    @GetMapping("/contextpath")
    public String getContextPath()
    {
        return "dummy context path";
    }
}
