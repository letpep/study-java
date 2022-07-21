package com.letpep.nacosconsumer.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name="letpep-nacos-provider")
public interface UserService {
    @GetMapping("/helloprovider")
    String helloNacos();
}
