package com.spring.code.conditional34;

import org.springframework.context.annotation.Condition;
import org.springframework.context.annotation.ConditionContext;
import org.springframework.core.type.AnnotatedTypeMetadata;
//自定义条件
public class WinConditional implements Condition {

    @Override
    public boolean matches(ConditionContext context, AnnotatedTypeMetadata metadata) {
       return context.getEnvironment().getProperty("os.name").contains("Windows");
    }
}
