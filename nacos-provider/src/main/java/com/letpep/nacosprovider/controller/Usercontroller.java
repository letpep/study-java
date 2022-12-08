package com.letpep.nacosprovider.controller;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Usercontroller {
    @Value("${server.port}")
    private String serverPort;
    @GetMapping("/helloprovider")
    @SentinelResource(value ="SentinelService.lkcount",blockHandler = "demoBlockHandler"
    )
    public String helloNacos(){
        System.out.println("Hello --"+serverPort);
        return "Hello --"+serverPort;
    }
    public String demoBlockHandler(BlockException e){
        System.out.println("sorry  --block"+serverPort);
        return "fail --"+serverPort;
    }
}
