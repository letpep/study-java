package com.letpep.nacosconfigclient.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

//@RefreshScope
@RestController
public class UserController {

    @Value("${user.name2}")
    private String name2;

    @Value("55")
    private int age;

    @GetMapping("/name")
    public String getUsername(){
        return "获取"+ name2;
    }
    @GetMapping("/age")
    public String getUserage(){
        return "获取"+ age;
    }
}
