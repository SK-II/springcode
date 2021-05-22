package com.spring.code.day7.bean;

import org.springframework.beans.factory.InitializingBean;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

//@Component
public class Jeep implements InitializingBean {

    public Jeep() {
    	System.out.println("jeep() 构造函数");
    }

    @PostConstruct
    public void init() {
        System.out.println("Jeep @PostConstruct.");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Jeep @PreDestroy.");
    }

    public void initMethod() {
        System.out.println("Jeep initMethod[@Bean]初始化方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Jeep afterPropertiesSet[InitializingBean]初始化方法");
    }
}
