package com.spring.code.day7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p>Title: MyBeanRegistryPostProcessor.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年2月23日  
 */
@Component
public class MyBeanFactoryPostProcessor implements BeanFactoryPostProcessor,InitializingBean {

	
	public MyBeanFactoryPostProcessor() {
		System.out.println("MyBeanFactoryPostProcessor 构造器.");
	}

	
	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		System.out.println("MyBeanFactoryPostProcessor postProcessBeanFactory (beanFactory后置处理器)");
	}


	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("MyBeanFactoryPostProcessor afterPropertiesSet初始化方法");
	}
	
}
