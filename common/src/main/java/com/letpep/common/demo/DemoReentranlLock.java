package com.letpep.common.demo;

import com.letpep.common.model.DataModel;
import com.letpep.common.service.LockService;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.locks.AbstractQueuedSynchronizer;
import java.util.concurrent.locks.ReentrantLock;

public class DemoReentranlLock {
    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch = new CountDownLatch(3000);
        LockService service = new LockService();
        ReentrantLock lock = new ReentrantLock(false);
        for(int i =0;i<3000;i++){

                new Thread(()->{
                    LockService service2 = new LockService();
//                    ReentrantLock lock = new ReentrantLock(true);

                    for(int j=0;j<2;j++) {
                        service2.service11(lock);
//                        service.service11(lock);
//                        System.out.println(Thread.currentThread().getName()+"------"+ DataModel.count++);

                    }
                    latch.countDown();
                }).start();

        }
        latch.await();
        System.out.println(Thread.currentThread().getName()+"-----"+DataModel.count);

    }
}
