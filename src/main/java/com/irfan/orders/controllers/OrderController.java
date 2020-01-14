package com.irfan.orders.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {
    
    @GetMapping("/getMessage")
    public String testMethod(){
        return "this is my first example";
    }
}
