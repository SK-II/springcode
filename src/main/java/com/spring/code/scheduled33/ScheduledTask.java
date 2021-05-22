package com.spring.code.scheduled33;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.text.SimpleDateFormat;
import java.util.Date;

//计划任务
@Service
public class ScheduledTask {

    private static final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

    @Scheduled(fixedRate = 5000)
    public void reprotCurrentTime() {
        System.out.println("每隔五秒执行一次：" + sdf.format(new Date()));
    }

    @Scheduled(cron = "0 27 21 ? * *")
    public void fixTimeExecution() {
        System.out.println("指定时间执行：" + sdf.format(new Date()));
    }
}
