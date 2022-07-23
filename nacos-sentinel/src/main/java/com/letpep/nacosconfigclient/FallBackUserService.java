package com.letpep.nacosconfigclient;

import com.alibaba.csp.sentinel.command.annotation.CommandMapping;
import com.letpep.nacosconfigclient.client.UserService;
import org.springframework.stereotype.Component;

@Component
public class FallBackUserService implements UserService {
    @Override
    public String helloNacos() {
        System.out.println(11111);
        return "2222";
    }
}
