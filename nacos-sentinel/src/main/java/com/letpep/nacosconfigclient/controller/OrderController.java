package com.letpep.nacosconfigclient.controller;

import com.letpep.nacosconfigclient.client.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OrderController {

    @Autowired
    private UserService userService;

    @GetMapping("/order")
    public String order(){
       return  userService.helloNacos();
    }
}
