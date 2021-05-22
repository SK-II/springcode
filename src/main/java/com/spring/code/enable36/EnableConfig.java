package com.spring.code.enable36;

import com.spring.code.day7.bean.MyBeanDefinitionRegistryPostProcessor;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Import(value = {ImportBeanDefinitionRegistrarDemo.class, MyBeanDefinitionRegistryPostProcessor.class})
@Configuration
public class EnableConfig {

}
