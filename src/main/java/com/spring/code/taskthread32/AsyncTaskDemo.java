package com.spring.code.taskthread32;

import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Component;

@Component
public class AsyncTaskDemo {

    @Async //异步注解
    public void executeAsyncTask(Integer i) {
        System.out.println("executeAsyncTask " + i);
    }


    @Async //异步注解
    public void executeAsyncTaskPlus(Integer i) {
        System.out.println("executeAsyncTaskPlus " + i);
    }
}
