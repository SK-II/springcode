package com.spring.code;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * <p>Title: day7.java</p>  
 * <p>Description: </p>
 * @author shuailiang.yang
 * @date 2019年12月30日  
 */
@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest
public class day7Test {
	
	@Test
	public void test() {
//		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MainConfigOfLifeCycle.class);
//		System.out.println("容器加载完毕..");
//		Object bean = context.getBean("beanFactory");
//		System.out.println("bena===="+bean);
//		Object bean2 = context.getBean("&myFactoryBean");
//		System.out.println("bena2===="+bean2);
//		context.getBean(PojoBeanPostProcessor.class);
        /*String[] beanNames = context.getBeanDefinitionNames();
        System.out.println("----");
        Stream.of(beanNames).forEach(System.out::println);
        System.out.println("----");
        Bike bean1 = context.getBean(Bike.class);
		Bike bean2 = (Bike) context.getBean("bike");
		System.out.println("是否相等：" + (bean1 == bean2));*/

//        context.close();
		
	}
}
