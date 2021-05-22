package com.spring.code;

import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.spring.code.aware.AwareConfig;
import com.spring.code.aware.bean.Red;

import java.io.IOException;

/**
 * <p>Title: AwareTest.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月6日  
 */
public class AwareTest {
	
	@Test
	public void awareMethod() throws IOException {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(AwareConfig.class);
		Red red = context.getBean(Red.class);
		red.setBeanName("red");
		red.setApplicationContext(context);
		red.out();
        context.close();
	}
}
