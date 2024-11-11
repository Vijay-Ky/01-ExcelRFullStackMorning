package com.excelr.MySecondApp.secondRest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SecondRestController
{
    @GetMapping("/secondRest")
    public String secondRestController()
    {
        return "Hello from secondRestController";
    }
}
