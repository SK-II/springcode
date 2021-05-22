package com.spring.code;

/**
 * <p>Title: Person.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2019年12月30日  
 */
public class Person {
	
	public String name;
	
	public Integer age;

	public Person() {
		super();
		System.out.println("Person ");
	}

	public Person(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
	
}
