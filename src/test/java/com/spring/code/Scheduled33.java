package com.spring.code;

import com.spring.code.scheduled33.ScheduledConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Scheduled33 {

    @Test
    public void out() {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext(ScheduledConfig.class);
    }


}
