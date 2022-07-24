package com.letpep.demosentinel;


import com.letpep.demosentinel.client.UserService;
import org.springframework.stereotype.Component;

@Component
public class FallBackUserService implements UserService {
    @Override
    public String helloNacos() {
        System.out.println("block");
        return "-3";
    }
}
