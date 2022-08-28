package com.letpep.common.demo;

import com.letpep.common.model.Dog;
import com.letpep.common.model.Person;
import com.letpep.common.model.SingltonPerson;
import org.openjdk.jol.info.ClassLayout;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.concurrent.ConcurrentHashMap;

public class Domain {
    public static void main(String[] args) throws InterruptedException {
//        SingltonPerson p = new SingltonPerson();
//        System.out.println(p);
        Person p = new Person();

        String a = new String ("abc");
        p.setName(new String("jhad jakdkkdjjjjjjjjjjjjjjjjj"));
        p.setLen(new Double(2.333333333333333333333));
        p.setDog(new Dog("dog",1));
//        Person p2 = new Person();
//
//        p2.setName(new String("abc"));
//        p2.setLen(new Double(123));
//
//        System.out.println(ClassLayout.parseInstance(p).toPrintable());
//
//        System.out.println(ClassLayout.parseInstance(p2).toPrintable());
        Thread.sleep(5000);
        synchronized (p){
            System.out.println(ClassLayout.parseInstance(p).toPrintable());
        }


    }
    public void test(){
        Person p2 =new Person();
    }
}
