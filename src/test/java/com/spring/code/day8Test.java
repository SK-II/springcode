package com.spring.code;

import com.spring.code.day8.MainConfig8;
import com.spring.code.day8.bean.Bird;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.io.IOException;

public class day8Test {

    @Test
    public void method() throws IOException {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig8.class);
        System.out.println("容器加载完毕.");
       /* String[] names = context.getBeanDefinitionNames();
        for(String name : names) {
            System.out.println(name);
        }*/
//        System.out.println(context.getBean(Bird.class));
//        System.out.println(context.getEnvironment().getProperty("bird.color"));
        MainConfig8 bean = context.getBean(MainConfig8.class);
        bean.systemOut();
    }

}
