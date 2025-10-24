package com.example.spring_boot.controller;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class ApiController {

    private List<String> messages = new ArrayList<>();

    @GetMapping("/messages")
    public List<String> getAllMessages() {
        return messages;
    }

    @PostMapping("/messages")
    public String addMessage(@RequestBody String message) {
        messages.add(message);
        return "Message added: " + message;
    }

    @GetMapping("/messages/{id}")
    public String getMessage(@PathVariable int id) {
        if (id >= 0 && id < messages.size()) {
            return "Message " + id + ": " + messages.get(id);
        }
        return "Message not found";
    }

    @DeleteMapping("/messages/{id}")
    public String deleteMessage(@PathVariable int id) {
        if (id >= 0 && id < messages.size()) {
            return "Message deleted: " + messages.remove(id);
        }
        return "Message not found";
    }
}