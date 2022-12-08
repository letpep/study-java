package com.letpep.common;

import com.letpep.common.config.MyProperties;
import com.letpep.common.controller.RemotApi;
import com.letpep.common.model.Cat;
import com.letpep.common.model.Dog;
import com.letpep.common.model.Person;
import com.letpep.common.redis.RedisService;
import feign.Feign;
import org.mybatis.spring.annotation.MapperScan;
import org.redisson.api.RLock;
import org.redisson.api.RedissonClient;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
@MapperScan("com.letpep.common.dao")
public class CommonApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CommonApplication.class, args);
//        context.getBean(Cat.class);
//        Cat cat1 = context.getBean("cat1",Cat.class);
//        Cat cat2 = context.getBean("cat1",Cat.class);
//        System.out.println("cat1==cat2 is " + (cat1==cat2));
//        Dog dog1 = context.getBean("dog1",Dog.class);
//        Dog dog2 = context.getBean("dog1",Dog.class);
//        System.out.println("dog1==dog2 is " + (dog1==dog2));
//        System.out.println(cat1);
//        System.out.println(dog1);
//        Person person = context.getBean(Person.class);
////        System.out.println(person);
//        System.out.println(context.getBean(MyProperties.class).getName());
//        (context.getBean(RedisService.class)).setString("test","testvalue");
//        (context.getBean(RedisService.class)).setExpireTime("test",5);
//        for (int i=1;i<=100000;i++){
//            RemotApi target = Feign.builder().target(RemotApi.class, "http://59.110.213.45:18087");
//            System.out.println( target.getHello());
//        }
//        RedissonClient redissonClient =(RedissonClient) context.getBean("redisson");
//        redissonClient.getBucket("test").set("helloredission");
//        RLock lock = redissonClient.getLock(Thread.currentThread().getName());
//        lock.lock();
//        lock.unlock();
//
//        System.out.println(redissonClient.getBucket("test").get());
    }

}
