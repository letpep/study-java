package com.letpep.demosentinel.service;

import com.alibaba.csp.sentinel.annotation.SentinelResource;
import com.alibaba.csp.sentinel.slots.block.BlockException;
import com.letpep.demosentinel.client.SentinelService;
import org.springframework.stereotype.Component;

@Component
public class SentinelServiceImpl implements SentinelService {

    public Integer fail(BlockException e){
        e.printStackTrace();
        System.out.println("blocked");
        return -100;
    }


    @Override
    @SentinelResource(value ="SentinelService.lkcount",blockHandler = "demoBlockHandler"
    )
    public Integer lkCount() {
        return 100;
    }
    @Override
    @SentinelResource(value ="SentinelService.lkcount2")
    public Integer lkCount2() {
        return 101;
    }

    @Override
    @SentinelResource(value ="SentinelService.lkcount3")
    public Integer lkCount3() {
        return 102;
    }
    public Integer demoBlockHandler(BlockException e) {
        System.out.println("------------正在限流------------");
        return -100;
    }
}
