package com.spring.code.aop;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * <p>Title: AopMainConfig.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月7日  
 */
@EnableAspectJAutoProxy //开启切面
@Configurable
@ComponentScan("com.spring.code.aop")
public class AopMainConfig {
	
	/**
	 * 通知方法：
	 * 		前置通知@Before 目标方法之前执行
	 * 		后置通知@After	  目标方法之后执行
	 * 		返回通知@AfterRetuing  目标方法正常返回执行
	 * 		异常通知@AfterThrowing 目标方法异常执行
	 * 		环绕通知@Around	目标方法前后执行  joinPoint.procced
	 */
	
	@Bean
	public LogInfo logInfo() {
		return new LogInfo();
	}
	
	@Bean
	public MathCalulator mathCalulator() {
		return new MathCalulator();
	}


}
