package com.spring.code.circular;

//@Component
//@Service
public class X {

    //@Autowired
    private Z z;

    //导致循环依赖
    /*public X(Z z) {
        this.z = z;
        System.out.println("X {有参构造函数}");
    }*/

//    public X() {
//        System.out.println("X {无参构造函数}");
//    }

    public void setZ(Z z) {
        this.z = z;
    }
}
