package com.example.demo.controllers;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.demo.JpaRepo;
import com.example.demo.models.userLogin;


@RestController

public class ThankController {

    @Autowired
    JpaRepo repo;

   
    @PostMapping("/user")
     public Boolean Thank(@RequestBody userLogin usl){

        // System.out.println("User ID: " + usl.getUserId());
        // System.out.println("Password: " + usl.getUserPassword());

        // userLogin user = new userLogin();
        // user.setUserId(usl.getUserId());
        // user.setUserPassword(usl.getUserPassword());

        // repo.save(usl);

        
        // ModelAndView mv = new ModelAndView();

        // mv.setViewName("Thank");
        // mv.addObject("name", user.getUserId());
        // mv.addObject("pass", user.getUserPassword());

        // System.out.println("Success\n");

       
        // System.out.println("User ID: " + user.getUserId());
        // System.out.println("Password: " + user.getUserPassword());

        try{
            repo.save(usl);
            return true;
        }
        catch(Exception e) {
            return false;
        }
    }
}
