package com.letpep.common.demo;

public class DemoCode {
    public static void main(String[] args) {
        reverInteger();
    }

    public static void reverInteger() {
        int x = -123;
        int res =0;
        while(x!=0){
            int temp = x%10;

            x= x/10;
            res=res*10+temp;
        }
        System.out.println(res);

    }
}
