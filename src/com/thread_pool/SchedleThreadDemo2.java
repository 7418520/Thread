package com.thread_pool;

import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class SchedleThreadDemo {
    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(5);
       scheduledExecutorService.schedule(new Runnable() {
           @Override
           public void run() {
               System.out.println("延迟三秒。。");
           }
       },3, TimeUnit.SECONDS);
       scheduledExecutorService.shutdown();
    }
}
