package com.thread.threadPool.threadExecutor;

/**
 * Created by Administrator on 2017/4/7 0007.
 */
public class MyThread implements Runnable {
    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"正在执行。。。。");
    }
}
