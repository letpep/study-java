package com.letpep.common.demo;


import com.letpep.common.model.Cat;
import com.letpep.common.model.Person;
import com.letpep.common.service.SynchronizedService;
import lombok.SneakyThrows;
import org.openjdk.jol.info.ClassLayout;

import java.util.concurrent.CountDownLatch;

public class DemoSynchronized {
    @SneakyThrows
    public static void main(String[] args) {
        Cat p = new Cat();
        CountDownLatch latch = new CountDownLatch(30);

        for(int i=0;i<30;i++){
            new Thread(()->{
//                synchronized (p){
                    p.setName("s1");
                    System.out.println(Thread.currentThread().getName()+"-------"+p.age2++);
//                    System.out.println(Thread.currentThread().getName()+ClassLayout.parseInstance(p).toPrintable());
                    new SynchronizedService().testsyn(p);
                    latch.countDown();
//                }
            }
            ).start();
        }
        latch.await();
        System.out.println(Thread.currentThread().getName()+"-------"+ p.age2);
    }
//public static void main(String[] args) {
//    new SynchronizedService().test2();
//    new SynchronizedService().test3();
//}
}
