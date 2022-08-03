package com.letpep.common.service;

import com.letpep.common.model.Cat;
import org.openjdk.jol.info.ClassLayout;

public class SynchronizedService {
    private String name ="123";
    public void testsyn(Cat cat){
//        synchronized (cat){
            cat.setName("s1");
            System.out.println(Thread.currentThread().getName()+"-------"+cat.age2++);
//            System.out.println(Thread.currentThread().getName()+ ClassLayout.parseInstance(cat).toPrintable());
//        }
    }
    synchronized  public void test2(){
        System.out.println(ClassLayout.parseInstance(this).toPrintable());
    }
    public void test3(){
        System.out.println(ClassLayout.parseInstance(this).toPrintable());
    }
}
