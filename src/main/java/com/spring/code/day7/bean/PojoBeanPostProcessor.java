package com.spring.code.day7.bean;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.convert.ConversionService;

//@Component
public class PojoBeanPostProcessor implements BeanPostProcessor {
	

	public PojoBeanPostProcessor() {
		System.out.println("PojoBeanPostProcessor 构造函数.");
	}

	@Override
    public Object postProcessBeforeInitialization(Object bean, String beanName) throws BeansException {
	    if(!"mvcConversionService".equals(beanName)) {
            //在初始化方法之前进行后置处理工作
            //init-method=init 之前调用
            System.out.println("[BeanPostProcessor]{postProcessBeforeInitialization}[之前] "+beanName+"  "+bean.toString());
        }
        return bean;
    }

    @Override
    public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
        if(!(bean instanceof ConversionService)) {
            //在初始化方法之前进行后置处理工作
            //init-method=init 之后调用
            System.out.println("[BeanPostProcessor]{postProcessAfterInitialization}[之后] "+beanName+"  "+bean.toString());
        }
        return bean;
    }

}
