package com.letpep.common.demo;

public class DemoString {
    public static void main(String[] args) {
        String a = new String ("abc");
        String b = new String ("abc");
        String e = new String ("abc");
        System.out.println(a==b);
        System.out.println(b==e);
        String c = "dbf";
        String d = "dbf";
        System.out.println(c==d);
    }
}
