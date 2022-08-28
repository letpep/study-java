package com.letpep.common.model;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.*;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.stereotype.Component;

@Component
public class BeanLife implements BeanNameAware, BeanFactoryAware, ApplicationContextAware, InitializingBean , DisposableBean

{
    private String a;

    @Override
    public void setBeanName(String name) {
        System.out.println("BeanNameAware--------------------"+name);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {

    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }

    @Override
    public void destroy() throws Exception {

    }

    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        System.out.println("BeanFactoryAware --------------"+beanFactory);
    }
}
