package com.excelr.springboot.MyFirstApp.rest;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoRestController
{
    @GetMapping("/callSayHello")
    public String sayHello()
    {
        return "Hello!";
    }
}
