package com.spring.code;

import java.util.HashMap;

import org.junit.Test;

/**
 * <p>Title: DataTest.java</p>  
 * <p>Description: </p>  
 * @author shuailiang.yang
 * @date 2020年4月30日  
 */
public class DataTest {
	
	
	@Test
	public void out() {
		HashMap<String, String> map = new HashMap<>();
		for(int i = 0; i < 20; i++) {
            map.put("我是"+i,"是我"+i);
        }
	}
	
}
