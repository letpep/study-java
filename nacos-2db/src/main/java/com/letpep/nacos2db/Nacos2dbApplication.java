package com.letpep.nacos2db;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
//指定某个包下边所有接口转换成实现类（就不用在接口上逐个注解）
@MapperScan("com.letpep.nacos2db.dao")
public class Nacos2dbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nacos2dbApplication.class, args);
	}

}
