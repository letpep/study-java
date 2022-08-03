package com.letpep.common.service;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicProxyService implements InvocationHandler {

    private  Object targetObject;
    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("==我执行了===");
        Object invoke = method.invoke(targetObject,args);
        return  invoke;
    }
    public  Object getInstance(Object target){
        this.targetObject= target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(),target.getClass().getInterfaces(),this);
    }
}
