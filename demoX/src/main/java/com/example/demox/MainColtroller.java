package com.example.demox;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


//Simple web value creation class
@RestController
@RequestMapping("/api/test")

public class MainColtroller {
    @GetMapping
    public String home() {
        return "Victory";
    }
}
