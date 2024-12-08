package com.sharma.nakul.controllers;

import com.sharma.nakul.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/nakul/sharma")
public class myFirstController {

    @GetMapping("/sayHello")
    public String sayHello(){
        return "Hello from first Controller";
    }

    @PostMapping("/orders")
    public String orders(@RequestBody Order order){
        System.out.println(order);
        return order.toString();
    }
}
