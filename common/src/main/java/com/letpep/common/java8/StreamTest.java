package com.letpep.common.java8;

import lombok.val;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.*;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Stream 用于操作集合：
 * 1.集合转换成流
 * 2.操作流
 *  2.1 操作流有中间操作符，和终止操作符
 *  2.2 中间操作符  filter sort skip limit map
 *  2.3 终止操作符  collect  foreach
 */
public class StreamTest {
    public static void main(String[] args) {
//    new StreamTest().filterT();
//    new StreamTest().distinctT();
//    new StreamTest().limitT();
//    new StreamTest().mapT();
//        new StreamTest().collectMap();
//        new StreamTest().collectGroup();
        new StreamTest().foreachT();
    }


    /**
     * 将集合中的元素进行过滤，找出符合条件元素
     */
    public void filterT(){
        List<String> strlist = Arrays.asList("lily","lucy","jhon","david");

        List<String> filters = strlist.stream().filter(str->str.contains("l")).collect(Collectors.toList());
        System.out.println(filters);

     }

    /**
     * 去重 ，对象类型要重写equal 方法
     */
    public void distinctT(){
        List<String> strlist = Arrays.asList("lily","lucy","jhon","david","lily");
        List<String> collected = strlist.stream().distinct().collect(Collectors.toList());

        System.out.println(collected);
        List<User> users = new ArrayList<User>();
        users.add(new User("lily",24));
        users.add(new User("lily",24));
        users.add(new User("lily",24));
        List<User> collected2 = users.stream().distinct().collect(Collectors.toList());
        collected2.forEach(user-> System.out.println(user.getName()));
    }

    public void limitT (){
        List<String> strlist = Arrays.asList("lily","lucy","jhon","david","lily");
        Stream<String> stream = strlist.stream();
        List<String> collected = strlist.stream().limit(2).collect(Collectors.toList());
        System.out.println(collected);
    }

    /**
     * 1 对流中每个元素，做处理，然后将处理结果（使用return方法），做为此新元素，然后进行最终操作符，操作
     * 2 map（） 方法的参数 ，是一个函数，我们可以将其定义为一个将流中元素做为参数的一个只有一个抽象方法的接口，使用lamda表达式进行实现
     *
     */
    public void mapT(){
        List<String> strlist = Arrays.asList("lily","lucy","jhon","david","lily");
        List<String> collected = strlist.stream().map(str->{ return str.concat("_letpep").toUpperCase();}).collect(Collectors.toList());

        
        System.out.println(collected);
    }
    //**********************************最终操作符**************************
    //将流中元素转换成map,map的key value，都可以是一个lamda函数
    public void collectMap(){
        List<User> users = new ArrayList<User>();
        users.add(new User("lily",25));
        users.add(new User("jhon",26));
        users.add(new User("mark",27));
//        Map<Integer, String> userMap = users.stream().map(user -> {
//            user.setName(user.getName().concat("_letpep"));
//            return user;
//        }).collect(Collectors.toMap(User::getAge, User::getName));
        Map<Integer, User> userMap = users.stream().map(user -> {
            user.setName(user.getName().concat("_letpep"));
            return user;
        }).collect(Collectors.toMap(user ->user.getAge(),user->{return user;}));
        System.out.println(userMap);

    }

    public void collectGroup(){
        List<User> users = new ArrayList<User>();
        users.add(new User("lily",25));
        users.add(new User("jhon",26));
        users.add(new User("mark",27));
        Map<Integer, List<User>> group1 = users.stream().collect(Collectors.groupingBy(user -> user.getAge()));
        Map<Integer, Set<User>> group2 = users.stream().collect(Collectors.groupingBy(user -> user.getAge(), Collectors.toSet()));
        System.out.println(group1);
        System.out.println(group2);


    }

    public void foreachT(){
        List<User> users = new ArrayList<User>();
        users.add(new User("lily",25));
        users.add(new User("jhon",26));
        users.add(new User("mark",27));
        users.stream().forEach(user-> System.out.println(user.getName()));
    }

}
