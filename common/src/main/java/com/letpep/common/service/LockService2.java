package com.letpep.common.service;

import com.letpep.common.model.DataModel;

import java.util.concurrent.locks.ReentrantLock;

public class LockService2 {

    public  void service2(){
        ReentrantLock lock2= new ReentrantLock(true);
        lock2.lock();
        System.out.println(Thread.currentThread().getName()+"service2");
        lock2.unlock();
    }
    public  void service22(ReentrantLock lock2){
        lock2.lock();
        System.out.println(Thread.currentThread().getName()+"service2-----"+ DataModel.count++);
        lock2.unlock();
    }
}
