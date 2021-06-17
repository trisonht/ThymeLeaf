package com.example.springmvc2;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@SpringBootApplication
@Controller
public class Springmvc2Application {
    public static void main(String[] args) {
        SpringApplication.run(Springmvc2Application.class, args);
    }

    @GetMapping("/greeting")
    public String greeting(@RequestParam(name = "name", required = false, defaultValue = "World")String name, Model model){
        model.addAttribute("name", name);
        return "greeting";
    }}