package com.thread.threadPool.threadExecutor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

/**
 * 测试单线程池功能
 * Created by Administrator on 2017/4/7 0007.
 */
public class TestScheduledThreadExecutor {


    public static void main(String[] args) {
        ScheduledExecutorService scheduledExecutorService = Executors.newScheduledThreadPool(2);
        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println("======"),2000,3000, TimeUnit.MILLISECONDS);
        scheduledExecutorService.scheduleAtFixedRate(()-> System.out.println(System.nanoTime()),2000,3000, TimeUnit.MILLISECONDS);


        //scheduledExecutorService.shutdown();
    }
}
