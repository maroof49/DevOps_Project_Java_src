package com.example.devops;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class main {

    public static void main(String[] args) {
        SpringApplication.run(HelloDevOps.class, args);
    }

    @GetMapping("/")
    public String home() {
        return "Hello from DevOps Project!";
    }

    @GetMapping("/health")
    public String healthCheck() {
        return "Application is healthy!";
    }
}
