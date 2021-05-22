package com.spring.code.day7.bean;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

//@Component
public class Train implements InitializingBean, DisposableBean {

    public Train(){
        System.out.println("Train()..");
    }

    @Override
    public void destroy() throws Exception {
        System.out.println("Train destroy.");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Train afterPropertiesSet.");
    }
}
