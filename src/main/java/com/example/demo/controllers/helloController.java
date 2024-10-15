package com.example.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class helloController {
    @GetMapping("/index")
    public String helloworld(){
        return "index";
    }
    
    @GetMapping("index/login")
    public String login(){
        return "login";
    }
    
    
}
