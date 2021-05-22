package com.spring.code.day9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import com.spring.code.day9.service.DayService9;

@ComponentScan("com.spring.code.day9")
@Configuration
public class MainConfig9 {

	/**
	 * 1.默认先按照类型去找对应的组件
	 * 2.如果找到多个相同类型组件时，再按照属性名去找对应的组件
	 */
    @Primary //默认先装备组件
    @Bean("dayService99")
    public DayService9 dayService9() {
        System.out.println("dayService99");
        return new DayService9();
    }

}
