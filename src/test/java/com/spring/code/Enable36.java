package com.spring.code;

import com.spring.code.enable36.EnableConfig;
import com.spring.code.enable36.ImportBeanDefinitionRegistrarDemo;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.scheduling.annotation.EnableScheduling;

public class Enable36 {

    @Test
    public void out() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(EnableConfig.class);
        context.close();
    }
}
