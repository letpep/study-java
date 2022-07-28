package com.letpep.common.redis;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.ReactiveStringRedisTemplate;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.stereotype.Component;

import java.util.concurrent.TimeUnit;

@Component
public class RedisService {

    @Autowired
    private StringRedisTemplate stringRedisTemplate;
    public void setString (String key ,String value){
        stringRedisTemplate.opsForValue().set(key,value);
    }
    public  void setExpireTime (String key ,long timeout){
        stringRedisTemplate.boundValueOps(key).expire(timeout,TimeUnit.SECONDS);
    }
}
