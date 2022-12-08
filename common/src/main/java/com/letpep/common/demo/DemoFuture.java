package com.letpep.common.demo;

import java.util.concurrent.CompletableFuture;
import java.util.concurrent.ExecutionException;

public class DemoFuture {


    public static void main(String[] args) throws InterruptedException, ExecutionException {


        CompletableFuture<String> cf = CompletableFuture.supplyAsync(() -> {
            System.out.println("do something....start");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("do something....end");
            return "result";
        });
        Thread.sleep(100);
        System.out.println("111");

        Thread.sleep(4000);
        System.out.println(cf.get());
    }
}
