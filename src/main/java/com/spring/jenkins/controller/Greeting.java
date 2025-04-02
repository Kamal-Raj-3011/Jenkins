package com.spring.jenkins.controller;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;


@RestController
public class Greeting {
    @GetMapping("/")
    public String Greet() {
        return "Welcome to Jenkins CI/CD pipeline demo!";
    }
    
}
