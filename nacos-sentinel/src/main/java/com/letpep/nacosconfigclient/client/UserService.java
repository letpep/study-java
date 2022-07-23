package com.letpep.nacosconfigclient.client;

import com.letpep.nacosconfigclient.FallBackUserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name="letpep-nacos-provider" ,fallback =  FallBackUserService.class)
public interface UserService {
    @GetMapping("/helloprovider")
    String helloNacos();
}
