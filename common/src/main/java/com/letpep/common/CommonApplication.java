package com.letpep.common;

import com.letpep.common.model.Cat;
import com.letpep.common.model.Dog;
import com.letpep.common.model.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
public class CommonApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext context = SpringApplication.run(CommonApplication.class, args);
        context.getBean(Cat.class);
        Cat cat1 = context.getBean("cat1",Cat.class);
        Cat cat2 = context.getBean("cat1",Cat.class);
        System.out.println("cat1==cat2 is " + (cat1==cat2));
        Dog dog1 = context.getBean("dog1",Dog.class);
        Dog dog2 = context.getBean("dog1",Dog.class);
        System.out.println("dog1==dog2 is " + (dog1==dog2));
        System.out.println(cat1);
        System.out.println(dog1);
        Person person = context.getBean(Person.class);
        System.out.println(person);
    }

}
