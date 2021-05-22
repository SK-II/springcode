package com.spring.code.profile;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.EmbeddedValueResolverAware;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.util.StringValueResolver;

/**
 * <p>Title: MainConfigProfile.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月6日  
 */
//@Profile("test")  注意 没有标注的环境变量bean 再任何环境中都加载
@PropertySource("classpath:application.properties")
@Configurable
public class MainConfigProfile implements EmbeddedValueResolverAware{
	
	@Value("${bird.color}")
	private String color;
	
	private String nikename;
	
	@Profile("test") //默认default   @Profile 切换环境参数
	@Bean("profile1")
	public void profile1(@Value("${bird.name}")String name) {
		System.out.println(color);
		System.out.println(name);
		System.out.println(nikename);
	}
	
	@Profile("dev")
	@Bean("profile2")
	public void profile2(@Value("${bird.name}")String name) {
		System.out.println(color);
		System.out.println(name);
		System.out.println(nikename);
	}

	@Override
	public void setEmbeddedValueResolver(StringValueResolver resolver) {
		this.nikename = resolver.resolveStringValue("${bird.nikename}");
	}
	
}
