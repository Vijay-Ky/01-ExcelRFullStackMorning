package com.mainpackage.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
//@RequestMapping is an annotation in the Spring Framework that is used to map web requests to specific methods in a controller class.
@RequestMapping("/test")
public class MyRestController {

    // add code for the "/hello" endpoint

    @GetMapping("/hello")
    public String sayHello() {
        return "Hello World!";
    }
}
//Run the program
//go to http://localhost:8080/test/hello and you will get the output
//go to postman and with GET request paste the URL http://localhost:8080/test/hello and hit send then see the output as hello world!

