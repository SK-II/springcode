package com.spring.code.day8.bean;


import org.springframework.beans.factory.annotation.Value;

public class Bird {

	/**
	 *  @Value 赋值
	 *  ${} 环境变量取值
	 *  #{} spel 赋值
	 */
    @Value("Yang")
    public String name;

    @Value("25")
    public Integer age;

    @Value("${bird.color}")
    public String color;

    public Bird() {
        super();
        System.out.println("bird 构造.");
    }

    public Bird(String name,Integer age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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


    @Override
    public String toString() {
        return "Bird{" +
                "name='" + name + '\'' +
                ", age=" + age + '\'' +
                ", color=" + color +
                '}';
    }
}
