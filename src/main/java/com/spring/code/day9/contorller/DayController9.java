package com.spring.code.day9.contorller;

import com.spring.code.day9.service.DayService9;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

import javax.annotation.Resource;

@Controller
public class DayController9 {

//    @Resource(name = "") 组件不存在报错
    @Qualifier("dayService99") //多个相同类型组件+使用@Qualifier指定装配组件
    @Autowired(required = false) //找不到组件不报错
    private DayService9 dayService9;

    public void method() {
        System.out.println(dayService9);
    }
}
