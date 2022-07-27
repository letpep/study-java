package com.letpep.common.config;

import com.letpep.common.model.Cat;
import com.letpep.common.model.Dog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;

import static org.springframework.beans.factory.config.BeanDefinition.SCOPE_PROTOTYPE;

@Configuration
public class MyConfig {
    @Bean("cat1")
    @Scope(SCOPE_PROTOTYPE)//多例
    public Cat getCat (){
        System.out.println("创建cat");
        return new Cat("cat1",25);
    }
    @Bean("dog1") //默认单例
    @Lazy(true) //懒加载
    public Dog getDog(){
        System.out.println("创建dog");

        return new Dog("dog1",26);
    }
}
