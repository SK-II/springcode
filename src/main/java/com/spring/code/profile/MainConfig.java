package com.spring.code.profile;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

/**
 * <p>Title: MainConfig.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月6日  
 */
@PropertySource("classpath:application.properties")
@Configurable
public class MainConfig {
	
	
	@Bean
	public MainConfigProfile mainConfigProfile() {
		return new MainConfigProfile();
	}
	
}
