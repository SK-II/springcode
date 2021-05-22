package com.spring.code.aware;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

import com.spring.code.aware.bean.Red;

/**
 * <p>Title: AwareConfig.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月6日  
 */
@Configurable
public class AwareConfig {
	
	@Bean
	public Red red() {
		return new Red();
	}
	
}
