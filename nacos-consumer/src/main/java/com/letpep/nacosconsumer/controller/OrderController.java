package com.letpep.nacosconsumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class OrderController {

    @Value("${service.url}")
    private  String serivceurl;
    @Autowired
    private RestTemplate template;
    @GetMapping("/order")
    public String order(){
       return  template.getForObject(serivceurl+"/helloprovider",String.class);
    }
}
