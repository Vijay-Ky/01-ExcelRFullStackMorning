package com.mainpackage.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//@Controller, which means it's a part of a Spring MVC application.
//@Controller: This annotation marks this class as a controller component in a Spring MVC application. It handles incoming HTTP requests.
@Controller
public class SampleController
{
    // create a mapping for "/hello"

    //This is the method that will be executed when the "/hello" path is requested. It takes an argument of type Model named theModel. In Spring, the Model is used to pass data to the view.
    @GetMapping("/hello")
    public String sayHello(Model theModel)
    {
        //his line adds an attribute to the model. In this case, it's adding a theDate attribute with the current date and time.
        theModel.addAttribute("theDate", new java.util.Date());

        return "MVC";
    }
}
/*
This class handles a GET request to "/hello". When this path is accessed, it adds the current date and time to the model and returns the view named "helloworld". The associated Thymeleaf template (possibly named "helloworld.html") will use this model attribute to display the date and time on the webpage.
 */
