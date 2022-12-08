package com.letpep.demosentinel.client;


import com.letpep.demosentinel.FallBackUserService;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;

@Service
@FeignClient(name="letpep-nacos-provider",fallback = FallBackUserService.class)
public interface UserService {
    @GetMapping("/helloprovider")
    String helloNacos();
}
