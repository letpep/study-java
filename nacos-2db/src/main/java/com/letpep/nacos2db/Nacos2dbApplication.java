package com.letpep.nacos2db;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Nacos2dbApplication {

	public static void main(String[] args) {
		SpringApplication.run(Nacos2dbApplication.class, args);
	}

}
