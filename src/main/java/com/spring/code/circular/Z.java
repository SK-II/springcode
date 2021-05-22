package com.spring.code.circular;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

//@Component
//@Service
public class Z implements ApplicationContextAware, InitializingBean {

   // @Autowired
    private X x;

    private ApplicationContext context;

    //导致循环依赖
    /*public Z(@Lazy X x) {
        this.x = x;
        System.out.println("Z {有参构造函数}");
    }*/

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("Z [afterPropertiesSet]");
        x = context.getBean(X.class);
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        System.out.println("Z [setApplicationContext]");
        context = applicationContext;
    }

//    public Z() {
//        System.out.println("Z {无参构造函数}");
//    }

   /* public void setX(X x) {
        this.x = x;
    }*/

    public X getX() {
        return x;
    }
}
