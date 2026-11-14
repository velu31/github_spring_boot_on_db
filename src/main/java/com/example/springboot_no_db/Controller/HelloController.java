package com.example.springboot_no_db.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

    @GetMapping("/")
    public String home(){
        return "Spring Boot CI/CD is working!";
    }

    @GetMapping("/health")
    public String health() {
        return "Application is healthy!";
    }

}
