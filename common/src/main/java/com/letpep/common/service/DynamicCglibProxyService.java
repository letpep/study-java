package com.letpep.common.service;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class DynamicCglibProxyService implements MethodInterceptor {
    private Object target;
    public DynamicCglibProxyService( Object target){
        this.target = target;
    }

    @Override
    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
        System.out.println("开始增强");
        Object result  = method.invoke(target,args);
        System.out.println("结束增强");
        return result;
    }
    public Object getInstance(){
//        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(target.getClass());
        enhancer.setCallback(this);
        return enhancer.create();
    }

}
