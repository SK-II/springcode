package com.spring.code;

import com.spring.code.aop.AnnotationServiceDemo;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.code.aop.AopMainConfig;
import com.spring.code.aop.MathCalulator;

/**
 * <p>Title: AopTest.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月7日  
 */
public class AopTest {
	
	@Test
	public void aopTest() {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AopMainConfig.class);
//		Object bean = context.getBean("org.springframework.context.annotation.internalConfigurationAnnotationProcessor");
//		System.out.println(bean);
//		MathCalulator calulator = context.getBean(MathCalulator.class);
//		calulator.div(1, 1);

        AnnotationServiceDemo bean = context.getBean(AnnotationServiceDemo.class);
        bean.sayHello();
        context.close();
	}
	
}
