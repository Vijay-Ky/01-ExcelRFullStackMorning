package com.mainpackage.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController
{
    @GetMapping("/showMyLoginPage")
    public String showMyLoginPage()
    {
        return "plain-login";
    }
}
