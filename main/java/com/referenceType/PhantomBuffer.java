package com.referenceType;

import java.lang.ref.PhantomReference;
import java.lang.ref.Reference;
import java.lang.ref.ReferenceQueue;

/**
 * 申请缓冲区
 * Created by Administrator on 2017/4/1 0001.
 */
public class PhantomBuffer {
    private TestBean[] tests = new TestBean[0];
    private ReferenceQueue<TestBean[]> queue = new ReferenceQueue<>();
    private PhantomReference<TestBean[]> reference = new PhantomReference<>(tests,queue);

    /**
     * 获得缓冲区
     * @param size
     * @return
     */
    public TestBean[] get(int size) throws InterruptedException {
        System.out.println(tests.length);
        if(tests.length<size){
            tests = null;
            System.gc();
            /*System.out.println(queue);
            System.out.println(queue.poll());*/
            //queue.remove();//队列会一直阻塞直到虚引用加入到队列中
            if((reference = (PhantomReference<TestBean[]>) queue.poll())!=null){
                reference.clear();
                reference = null;
            }
            /*reference.clear();
            reference = null;*/
            tests = new TestBean[size];
            reference = new PhantomReference<>(tests,queue);
        }
        return tests;
    }

    public static void main(String[] args) throws InterruptedException {
        PhantomBuffer buffer = new PhantomBuffer();
        TestBean[] testBeans = buffer.get(10);
        System.out.println(testBeans.length);
    }
}
