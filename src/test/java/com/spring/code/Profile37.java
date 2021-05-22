package com.spring.code;

import com.spring.code.profile37.Bean;
import com.spring.code.profile37.ProfileConfig;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: ProfileTest.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年1月6日  
 */
@RunWith(SpringJUnit4ClassRunner.class) //提供spring textcontext framework 功能
@ContextConfiguration(classes = {ProfileConfig.class}) // 加载配置
@ActiveProfiles("dev") //声明活动的Bean
public class Profile37 {

    @Autowired
    Bean bean;

	@Test
	public void profiletest() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfig.class);
//		context.getEnvironment().setActiveProfiles("test","dev"); //设置需要激活的环境
//		context.register(MainConfigProfile.class); //注册配置
//        context.refresh(); //刷新容器
//
//        context.getBean(MainConfigProfile.class).profile1(null);

        Assert.assertEquals("devBean", this.bean.getContext());
	}
	
}
