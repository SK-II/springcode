package com.spring.code.day7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;
import org.springframework.beans.factory.support.BeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.ImportBeanDefinitionRegistrar;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.stereotype.Component;

/**
 * <p>Title: MyBeanFacaty.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年2月23日  
 */
@Component
public class MyBeanDefinitionRegistryPostProcessor implements BeanDefinitionRegistryPostProcessor,ImportBeanDefinitionRegistrar,InitializingBean {

	
	public MyBeanDefinitionRegistryPostProcessor() {
		System.out.println("MyBeanDefinitionRegistryPostProcessor 构造器.");
	}

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		// TODO Auto-generated method stub
		System.out.println("MyBeanDefinitionRegistryPostProcessor  postProcessBeanFactory (BeanFactory后置处理器)");
        System.out.println();
	}

	@Override
	public void postProcessBeanDefinitionRegistry(BeanDefinitionRegistry registry) throws BeansException {
		// TODO Auto-generated method stub
//		RootBeanDefinition beanDefinition = new RootBeanDefinition(Person.class);
//		registry.registerBeanDefinition("person", beanDefinition);
		System.out.println("MyBeanDefinitionRegistryPostProcessor  postProcessBeanDefinitionRegistry ");
	}

    @Override
    public void registerBeanDefinitions(AnnotationMetadata importingClassMetadata, BeanDefinitionRegistry registry) {
        System.out.println("ImportBeanDefinitionRegistrar registerBeanDefinitions (动态操作Bean)");
        registry.removeBeanDefinition("a");
        System.out.println("remove a :"+registry.getBeanDefinitionCount());
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("MyBeanDefinitionRegistryPostProcessor [afterPropertiesSet]");
    }
}
