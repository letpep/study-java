package com.letpep.common.service;

import com.letpep.common.model.DataModel;

import java.util.concurrent.locks.ReentrantLock;

public class LockService {
    public void service1(){
        ReentrantLock lock1 = new ReentrantLock(true);
        LockService2 service2 = new LockService2();
        lock1.lock();
        System.out.println(Thread.currentThread().getName()+"service1");
        service2.service2();
        lock1.lock();
    }
    public void service11(ReentrantLock lock1){
//        ReentrantLock lock1 = new ReentrantLock(false);
        LockService2 service2 = new LockService2();
        lock1.lock();

        System.out.println(Thread.currentThread().getName()+"service1------"+ DataModel.count++);
        service2.service22(lock1);
        lock1.unlock();
    }
}
