package com.spring.code.scheduled33;

import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//@EnableScheduling //开启计划任务
@Configuration
@ComponentScan("com.spring.code.scheduled33")
public class ScheduledConfig implements InitializingBean {

    public ScheduledConfig() {
        System.out.println("ScheduledConfig 构造函数");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("ScheduledConfig [InitializingBean]{afterPropertiesSet}");
    }

}
