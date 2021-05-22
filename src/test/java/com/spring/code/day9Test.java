package com.spring.code;

import com.spring.code.day9.MainConfig9;
import com.spring.code.day9.contorller.DayController9;
import com.spring.code.day9.service.DayService9;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class day9Test {

    @Test
    public void method() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig9.class);
        for(String name : context.getBeanDefinitionNames()) {
            System.out.println(name);
        }
        context.getBean(DayController9.class).method();
//        System.out.println(context.getBean(DayService9.class));

    }

}
