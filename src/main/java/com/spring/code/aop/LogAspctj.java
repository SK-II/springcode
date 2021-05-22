package com.spring.code.aop;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.Signature;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.aspectj.lang.reflect.MethodSignature;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

@Aspect
@Component
public class LogAspctj {

    @Pointcut("@annotation(com.spring.code.aop.Action)")
    public void annotationPinotCut(){}

    @Before("annotationPinotCut()")
    public void aspctjLog(JoinPoint joinPoint) {
        Object target = joinPoint.getTarget();
        MethodSignature signature = (MethodSignature) joinPoint.getSignature();
        Method method = signature.getMethod();
        Action annotation = method.getAnnotation(Action.class);
        String name = annotation.name();

        System.out.println("注解拦截："+name);
    }


}
