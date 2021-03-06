package com.thread.threadPool;

import java.util.LinkedList;

/**
 * 简单线程池实现
 * Created by Administrator on 2017/4/6 0006.
 */
public class MyThreadPool extends ThreadGroup{
    //cpu 数量 ---Runtime.getRuntime().availableProcessors();
    //是否关闭
    private boolean isClosed = false;
    //队列
    private LinkedList<Runnable> workQueue;
    //线程池id
    private static int threadPoolID;
    private int threadID;
    public MyThreadPool(int poolSize){
        super("MyThreadPool."+threadPoolID);
        threadPoolID++;
        setDaemon(true);
        workQueue = new LinkedList<Runnable>();
        for(int i = 0;i<poolSize;i++){
            new WorkThread().start();
        }
    }
    //这里可以换成ConcurrentLinkedQueue,就可以避免使用synchronized的效率问题
    public synchronized void execute(Runnable task){
        if(isClosed){
            throw new IllegalStateException("连接池已经关闭...");
        }else{
            workQueue.add(task);
            notify();
        }
    }

    /**
     * 一个阻塞方法，工作线程不断调用此方法，从线程池中获得提交的任务，然后执行
     * @return
     * @throws InterruptedException
     */
    protected synchronized Runnable getTask() throws InterruptedException {
        while(workQueue.size() == 0){
            if(isClosed){
                return null;
            }
            wait();
        }
        return workQueue.removeFirst();
    }

    public synchronized void close(){
        if(!isClosed){
            isClosed = true;
            workQueue.clear();
            interrupt();
        }
    }

    public void join(){
        synchronized (this) {
            isClosed = true;
            notifyAll();
        }
        Thread[] threads = new Thread[activeCount()];
        int count = enumerate(threads);
        for(int i = 0;i<count;i++){
            try {
                threads[i].join();
            } catch (Exception e) {
            }
        }
    }

    class WorkThread extends Thread{
        public WorkThread(){
            super(MyThreadPool.this,"workThread"+(threadID++));
            System.out.println("create...");
        }
        @Override
        public void run() {
            while(!isInterrupted()){
                System.out.println("run..");
                Runnable task = null;
                try {
                    //这是一个阻塞方法
                    task = getTask();

                } catch (Exception e) {

                }
                if(task != null){
                    task.run();
                }else{
                    break;
                }
            }
        }
    }
}