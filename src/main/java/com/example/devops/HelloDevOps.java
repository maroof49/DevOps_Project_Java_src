package com.example.devops;
package com.example;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.*;

@SpringBootApplication
@RestController
public class HelloDevOps {

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

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello DevOps!");
    }
}
