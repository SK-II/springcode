package com.spring.code.aop;

import java.lang.annotation.*;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME) //在运行时通过反射获取
@Documented
public @interface Action {
    String name();
}
