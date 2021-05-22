package com.spring.code.day7;

import com.spring.code.day7.bean.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

/**
 * <p>Title: MainConfigOfLifeCycle.java</p>
 * <p>Description: spring 生命周期</p>
 * @author shuailiang.yang
 * @date 2019年12月30日
 */
@ComponentScan(basePackages="com.spring.code.day7.bean")
//@Configurable
public class MainConfigOfLifeCycle {

    //@Lazy 懒加载
//	@Scope(scopeName="singleton")
//    @Bean
//    public Person person() {
//        return new Person("yang",25);
//    }


    @Bean(initMethod="init",destroyMethod="destory")
    public Bike bike() {
        return new Bike("bike");
    }
    

    @Bean(initMethod="initMethod")
    public PojoBeanPostProcessor pojoBeanPostProcessor() {
    	return new PojoBeanPostProcessor();
    }
    

    @Bean(initMethod = "initMethod")
    public Jeep jeep() {
        return new Jeep();
    }

}
