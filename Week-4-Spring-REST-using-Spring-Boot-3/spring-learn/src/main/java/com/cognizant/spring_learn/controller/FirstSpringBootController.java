package com.cognizant.spring_learn.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FirstSpringBootController {

    @RequestMapping("/get")
    public String getApi() {
    return "My Spring Boot API create Successfully";
    }

}
