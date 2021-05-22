package com.spring.code.aop;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.stereotype.Service;

@Service
public class AnnotationServiceDemo implements InitializingBean {

    private String name;

    private String address = "北京";

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = "中国";
    }

    public AnnotationServiceDemo() {
        System.out.println("AnnotationServiceDemo {构造函数}");
    }

    @Action(name = "sayHello")
    public void sayHello(){
        System.out.println("sayHello sayHello sayHello");
    };

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("AnnotationServiceDemo [InitializingBean]");
    }
}
