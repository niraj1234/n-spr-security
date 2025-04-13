package com.example;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class GreetingController {
    @GetMapping("/welcome")
    public String helloSpring(){
        return "Hello Spring Boot Security 2";
    }
}
