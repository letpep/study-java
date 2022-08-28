package com.letpep.common.demo;

import com.letpep.common.interfac.Useri;
import com.letpep.common.service.CglibService;
import com.letpep.common.service.DynamicCglibProxyService;
import com.letpep.common.service.DynamicProxyService;
import com.letpep.common.service.Userimpl;

import java.util.ArrayList;
import java.util.List;

/**
 * 动态代理实现
 */
public class DemoProxy {
    public static void main(String[] args) {
       jdkdy();
       cglibdy();
    }
    public static void jdkdy(){
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
//        ArrayList<String> strs = new ArrayList<String>();
//        List<String> strsproxy = (List<String>) new DynamicProxyService().getInstance(strs);
//        strsproxy.add("abc");
        Userimpl userimpl = new Userimpl();
        Useri useri = (Useri)new DynamicProxyService().getInstance(userimpl);
        useri.print();
    }
    public static void cglibdy(){
        CglibService cglibService = new CglibService();
        CglibService service = (CglibService)  new DynamicCglibProxyService(cglibService).getInstance();
        service.getHello();
//        Useri userimpl = new Userimpl();
//        Useri useri = (Useri) new DynamicCglibProxyService(userimpl).getInstance();
//        useri.print();


    }
}
