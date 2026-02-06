package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "你好王辉";
    }
    
    @GetMapping("/")
    public String home() {
        return "欢迎使用Spring Boot应用！";
    }
    
    @GetMapping("/echo")
    public String echo(@RequestParam String message) {
        return message;
    }
}