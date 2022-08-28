package com.letpep.common.java8;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CountDownLatch;

/**
 * 可见性  每次修改一个值 都会写入主存， 工作线程中的引用 失效
 * 原子性  count++; 三步：取值  ++  写入主存，但是volatile 不能保证 ，所以要使用atomic
 * 有序性 new 对象 三步骤 禁止指令重排
 */
public class VolatileTest {
     int count =1;

    public static void main(String[] args) throws InterruptedException {
        CountDownLatch latch= new CountDownLatch(100);
        VolatileTest tt = new VolatileTest();
        List<Integer> counts= new ArrayList<Integer>();
        for (int i =0 ;i<100;i++){
            Thread t = new Thread(()->{

                for (int j=0;j<10000;j++) {
                  tt.count++;
                    System.out.println(Thread.currentThread().getName()+"---"+tt.count);
                    counts.add(tt.count);
                    latch.countDown();
                }});
            t.start();
        }
        latch.await();
        System.out.println(tt.count);

    }

}
