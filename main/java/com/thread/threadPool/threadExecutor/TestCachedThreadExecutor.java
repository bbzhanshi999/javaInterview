package com.thread.threadPool.threadExecutor;


import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 测试单线程池功能
 * Created by Administrator on 2017/4/7 0007.
 */
public class TestCachedThreadExecutor {


    public static void main(String[] args) {
        ExecutorService executorService = Executors.newFixedThreadPool(2);

        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());
        executorService.execute(new MyThread());

        executorService.shutdown();
    }
}
