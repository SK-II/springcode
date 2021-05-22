package com.spring.code.aware.bean;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;

import java.io.IOException;
import java.util.Arrays;

/**
 * <p>Title: Red.java</p>  
 * <p>Description: xxxAware 都用对应的Processor </p>  
 * @author shuailiang.yang
 * @date 2020年1月6日  
 */
public class Red implements ApplicationContextAware,
        BeanNameAware,ResourceLoaderAware {

    private String beanName;

    private ResourceLoader resourceLoader;

	private ApplicationContext applicationContext;


	@Override
	public void setBeanName(String name) {
		//BeanNameAware 接口设置bean的名称
		this.beanName = name;
	}

	@Override
	public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
		// ApplicationContextAware  可传入ApplicationContext 来使用
		this.applicationContext = applicationContext;
	}

    @Override
    public void setResourceLoader(ResourceLoader resourceLoader) {
        this.resourceLoader = resourceLoader;
    }

    public void out() throws IOException {
        System.out.println("BeanNameAware "+beanName);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        System.out.println("ApplicationContextAware "+Arrays.asList(beanDefinitionNames));
        Resource resource = resourceLoader.getResource("classpath:/file.txt");
        System.out.println("ResourceLoaderAware "+ IOUtils.toString(resource.getInputStream()));
	}

}
