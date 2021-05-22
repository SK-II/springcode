package com.spring.code;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class CircularTest {

    @Test
    public void out() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
//        context.getBean("z");
    }


}
