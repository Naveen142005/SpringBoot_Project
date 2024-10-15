package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class funnyController {
    @GetMapping("/index/funny")
    public String funny(){
        System.out.println("hello");
        return "funny";
    }

}
