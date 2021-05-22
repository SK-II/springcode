package com.spring.code.yuanzhujie35;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

//使用一个注解代表组合注解统称元注解
@Target(ElementType.TYPE)  //TRPE 注解类   METHOD 方法   FIELD 字段
@Retention(RetentionPolicy.RUNTIME)
@Configuration
@ComponentScan("com.spring.code.yuanzhujie35")
public @interface ClassAnnotation {
    String[] value() default {};
}
