package com.spring.code;

import com.spring.code.taskthread32.AsyncTaskDemo;
import com.spring.code.taskthread32.TaskExecutorConfig;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TaskThread32 {

    @Test
    public void out() {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TaskExecutorConfig.class);
        AsyncTaskDemo asyncTaskDemo = context.getBean(AsyncTaskDemo.class);
        for(int i=0; i <100; i++) {
            asyncTaskDemo.executeAsyncTask(i);
            asyncTaskDemo.executeAsyncTaskPlus(i);
        }
        context.close();
    }

}
