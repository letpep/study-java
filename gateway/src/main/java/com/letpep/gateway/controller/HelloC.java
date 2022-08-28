package com.letpep.gateway.controller;


import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloC {
    @GetMapping("/hc")
    public String helloT (){
        return "Hello TT";
    }
}
