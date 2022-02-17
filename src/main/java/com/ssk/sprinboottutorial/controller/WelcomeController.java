package com.ssk.sprinboottutorial.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/microservice")
public class WelcomeController {

    @GetMapping("/welcome")
    public String getMessage(){
        return "welcome for the microservice architecture";
    }

}

