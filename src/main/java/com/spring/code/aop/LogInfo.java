package com.spring.code.aop;

import java.util.Arrays;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

/**
 * <p>
 * Title: LogInfo.java
 * </p>
 * <p>
 * Description:
 * </p>
 * 
 * @author shuailiang.yang
 * @date 2020年1月7日
 */
@Aspect
public class LogInfo {
	
	//切所有方法*  任意参数..
	//抽取公共切入表达式
	@Pointcut("execution(public int com.spring.code.aop.MathCalulator.*(..))")
	public void pointCut() {}
	

	//JoinPoint 参数必须在第一位否则报错
	@Before("pointCut()")
	public void logStart(JoinPoint joinPoint) {
		System.out.println("logStart @Before参数列表："+Arrays.asList(joinPoint.getArgs())+"方法名："+joinPoint.getSignature().getName());
	}

	//其他类切入
	@After("com.spring.code.aop.LogInfo.pointCut()")
	public void logEnd() {
		System.out.println("logEnd @After参数列表：{}");
	}

	//returning 接收返回值
	@AfterReturning(value="pointCut()",returning="result")
	public void logResult(JoinPoint joinPoint,Object result) {
		System.out.println("logResult @AfterReturning参数列表：{}"+Arrays.asList(joinPoint.getArgs())+"方法名："+joinPoint.getSignature().getName()+"返回值："+result);
	}
	
	//throwing 接收异常
	@AfterThrowing(value="pointCut()",throwing="exception")
	public void logException(JoinPoint joinPoint,Exception exception) {
		System.out.println("logException @AfterThrowing参数列表：{}"+exception.toString()+"方法名："+joinPoint.getSignature().getName());
	}

}
