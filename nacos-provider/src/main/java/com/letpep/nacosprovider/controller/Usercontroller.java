package com.letpep.nacosprovider.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/helloprovider")
    public String helloNacos(){
        try {
            Thread.sleep(10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "Hello --"+serverPort;
    }
}
