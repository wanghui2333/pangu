package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @GetMapping("/hello")
    public String hello() {
        return "你好，世界";
    }
    
    @GetMapping("/")
    public String home() {
        return "欢迎使用Spring Boot应用！";
    }
}