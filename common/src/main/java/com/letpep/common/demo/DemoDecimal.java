package com.letpep.common.demo;

import java.math.BigDecimal;

public class DemoDecimal {
    public static void main(String[] args) {
        BigDecimal b1 = BigDecimal.valueOf(3.3333);
        BigDecimal b2 = new BigDecimal(3.3333);
        BigDecimal b3 = new BigDecimal("3.3333");
        System.out.println(b1);
        System.out.println(b2);
        System.out.println(b3);
        System.out.println(b3.toString());
        Integer a= 3521;
        System.out.println(a.intValue());
    }
}
