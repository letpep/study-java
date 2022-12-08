package com.letpep.common.config;

import org.redisson.Redisson;
import org.redisson.api.RedissonClient;
import org.redisson.config.Config;
import org.redisson.config.SingleServerConfig;
import org.redisson.config.TransportMode;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

//@Configuration
public class RdissonConfig {
    @Value("${spring.redis.host}")
    private String redisurl;

    @Bean(value = "redisson")
    public RedissonClient getRedisson(){
        Config config = new Config();
        config.setTransportMode(TransportMode.NIO);
        SingleServerConfig singleServerConfig = config.useSingleServer();
        //可以用"rediss://"来启用SSL连接
        singleServerConfig.setAddress("redis://"+redisurl+":6379");
        singleServerConfig.setPassword("tttt");
        singleServerConfig.setConnectionMinimumIdleSize(10);
        singleServerConfig.setConnectionPoolSize(11);


        RedissonClient redisson = Redisson.create(config);
        return redisson;

    }
}
