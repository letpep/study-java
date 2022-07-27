package com.letpep.common.java8;

import org.springframework.http.converter.json.GsonBuilderUtils;

import java.util.Comparator;
import java.util.function.Consumer;

/**
 * 举例：(o1,o2)->Integer.compare(o1,o2);
 * 1.->  lamda操作符
 * 2. ->左边 形参列表，（其实就是接口（只有一个抽象方法），抽象方法的形参列表）
 * 3. -> 右边 lamda体，其实就是重写的抽象方法的方法体
 * 4.总结 lamda表达式 就是对接口抽象方法重写后，并实例化
 */
public class LamdaTest {

    public static void main(String[] args) {
//        new LamdaTest().testRunaable();
//        new LamdaTest().testComparator();
//        new LamdaTest().testSigleParam();
        new LamdaTest().multiParam();
    }
    public void testRunaable(){
        Runnable r1 = new Runnable() {
            @Override
            public void run() {
                System.out.println("hello old");
            }
        };
        r1.run();
         Runnable r2 = ()-> System.out.println("hello yong");
         r2.run();

    }
    public void testComparator (){
        Comparator<Integer> com1 = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                 return Integer.compare(o1,o2);
            }

        };
        int compare1 = com1.compare(0,1);
        System.out.println(compare1);
        System.out.println("*****************");
        //lamda 表达式
        Comparator<Integer> com2 = (o1,o2)->Integer.compare(o1,o2);
        System.out.println(com2.compare(10,1));
        System.out.println("*********************");
        //方法引用
        Comparator<Integer> com3 = Integer::compare;
        System.out.println(com3.compare(12,11));

    }
    //接口单参数 ，无返回值
    public void testSigleParam(){
        Consumer<String > con= new Consumer<String>() {
            @Override
            public void accept(String s) {
                System.out.println(s);
            }
        };
        con.accept("this 1");
        System.out.println("*****************");
        Consumer<String> con2 = (String s)-> System.out.println(s);
        con2.accept("this 2");
        System.out.println("***********************");
        //数据类型也可以省略 类型推断
        Consumer<String> con3 = (s)-> System.out.println(s);
        con3.accept("this 3");
        //当只有一个参数 时 小括号也可以省略
        System.out.println("*******************************");
        Consumer<String> con4 = s-> System.out.println(s);
        con4.accept("this 4");


    }
        ////当有多个参数 多条执行语音，并且 有返回 值
    public  void multiParam(){
        Comparator<Integer> com = (Integer o1,Integer o2)-> {int r= o1.compareTo(o2);
            return r;};
        System.out.println(com.compare(25,30));

        //类型推断
        Comparator<Integer> com2 = ( o1, o2)-> {int r= o1.compareTo(o2);
            return r;};
        System.out.println(com2.compare(22,12));
        //当lamda体只有一语句时，return 和大括号都可以省略
        Comparator<Integer> com3 = (o1,o2) ->o1.compareTo(o2);
        System.out.println(com3.compare(15,14));

    }
}
