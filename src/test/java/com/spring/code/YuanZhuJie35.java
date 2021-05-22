package com.spring.code;

import com.spring.code.yuanzhujie35.YuanZhuJieConfig;
import com.spring.code.yuanzhujie35.YuanZhuJieDemo;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class YuanZhuJie35 {

    @Test
    public void out() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(YuanZhuJieConfig.class);
        YuanZhuJieDemo bean = context.getBean(YuanZhuJieDemo.class);
        bean.out();
        context.close();
    }
}
