package com.thinkInJava;

/**
 *  测试finalize方法
 * Created by jilili on 2017/4/8.
 */
public class Finalize {

    @Override
    protected void finalize() throws Throwable {
        System.out.println("风的季节大觉寺对焦速度");
      //  super.finalize();
    }

    public static void main(String[] args) {
        new Finalize();
        System.gc();

    }
}
