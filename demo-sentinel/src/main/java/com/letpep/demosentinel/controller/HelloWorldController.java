package com.letpep.demosentinel.controller;

import com.letpep.demosentinel.client.SentinelService;
import com.letpep.demosentinel.client.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {

    @Autowired
    private UserService userService;
    @Autowired
    private SentinelService sentinelService;

    //控制台流程本机接口
    @GetMapping("/hello")
    public String hello(){
        return "hello world";
    }

    //控制台流控依赖的feign接口
    @GetMapping("/helloN")
    public String helloNacos(){

        return userService.helloNacos();
    }
    //代码流控本地接口
    @GetMapping("hellolk")
    public Integer helloLK(){
        System.out.println(sentinelService.lkCount2());
        return sentinelService.lkCount();
    }

}
