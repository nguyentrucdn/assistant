package com.assistant;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@SpringBootApplication
@ComponentScan("com.assistant")
public class App {
    @RequestMapping("/")
    public String home(){
        return "assistant";
    }
    public static void main(String[] args) {
        SpringApplication.run(App.class, args);
    }
}