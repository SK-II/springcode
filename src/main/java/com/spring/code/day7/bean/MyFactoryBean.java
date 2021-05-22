package com.spring.code.day7.bean;

import com.spring.code.Person;
import org.springframework.beans.factory.FactoryBean;

/**
 * <p>Title: MyFactoryBean.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年2月26日  
 */
//@Component
public class MyFactoryBean implements FactoryBean<Person> {

	@Override
	public Person getObject() throws Exception {
		// TODO Auto-generated method stub
		Person person = new Person("a", 1);
		return person;
	}

	@Override
	public Class<?> getObjectType() {
		// TODO Auto-generated method stub
		return Person.class;
	}
	
}
