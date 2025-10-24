package com.example.spring_boot.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Component
public class HelloController {

    @GetMapping("/")
    public String home() {
        return "Добро пожаловать)";
    }

    @GetMapping("/hello")
    public String hello() {
        return "Привет Мир!";
    }

    @GetMapping("/test")
    public String test() {
        return "Пу пу пу...";
    }
}
