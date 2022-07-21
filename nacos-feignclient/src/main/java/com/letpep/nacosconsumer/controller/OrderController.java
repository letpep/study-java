package com.letpep.nacosconsumer.controller;

import com.letpep.nacosconsumer.client.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {
    @Autowired
    private UserService userService;

    @GetMapping("/order")
    public String order(){
       return  userService.helloNacos();
    }
}
