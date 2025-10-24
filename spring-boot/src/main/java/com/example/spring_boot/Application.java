package com.example.spring_boot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    static void main(String[] args) {  // ← убрали 'public'
        SpringApplication.run(Application.class, args);
    }
}