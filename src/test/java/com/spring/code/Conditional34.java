package com.spring.code;

import com.spring.code.conditional34.ConditionalConfig;
import com.spring.code.conditional34.DataBase;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Conditional34 {

    @Test
    public void out() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ConditionalConfig.class);
        context.getBean(DataBase.class).showData();
        context.close();
    }



}
