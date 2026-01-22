package com.lab1.demo.base;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;

@RestController
@RequiredArgsConstructor
public class HealthController {

    @GetMapping("/health")
    public String healthCheck() {
        return "Lab 1: " + LocalDateTime.now();
    }
}
