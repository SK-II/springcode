package com.spring.code.conditional34;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionalConfig {

    @Bean
    @Conditional(WinConditional.class) //指定条件创建Bean
    public DataBase winDataBase() {
        return new WinDataBase();
    }

    @Bean
    @Conditional(LiunxConditional.class) //指定条件创建Bean
    public DataBase LiunxDataBase() {
        return new LiunxDataBase();
    }

}
