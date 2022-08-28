package com.letpep.common.model;

public class CLModel {
    public int a =1;
    public static int  b =2;
    {
        System.out.println("构造代码块");

    }
    static {
        System.out.println("静态代码块");
    }
    public  CLModel(){
        System.out.println("无参构造方法");
    }
}
