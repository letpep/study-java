package com.letpep.common.demo;

public class DemoSingleton {
    private static volatile   DemoSingleton instance;
    private DemoSingleton(){

    }
    public static DemoSingleton getInstance(){
        if (instance==null){
            synchronized (instance){
                if(instance==null)
                instance = new DemoSingleton();
            }

            return instance;
        }

        return instance;
    }
}
