package com.spring.code.day7.bean;
/**
 * <p>Title: Bike.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2019年12月30日  
 */
public class Bike {

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bike() {
		System.out.println("Bike() 无参构造...");
	}
	
	public Bike(String name) {
		System.out.println("Bike() 有参构造...");
		this.name = name;
	}

	public void init() {
		System.out.println("Bike init.");
	}
	
	
	public void destory() {
		System.out.println("Bike destory.");
	}
	
}
