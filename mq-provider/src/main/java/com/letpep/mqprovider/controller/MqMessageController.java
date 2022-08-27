package com.letpep.mqprovider.controller;

import org.apache.rocketmq.spring.core.RocketMQTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/mq")
public class MqMessageController {

    @Autowired
    private RocketMQTemplate rocketMQTemplate;

    @RequestMapping("/put")
    public String putmsg(){
        rocketMQTemplate.convertAndSend("letpeptopic","Hello 啊"+System.currentTimeMillis());
        return "sucess";
    }


}
