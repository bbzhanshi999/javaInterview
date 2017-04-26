package com.designModel.singleton.innerClass;

/**
 * 内部类方式实现单例（好处就是通过内部类的独有加载机制隔绝线程安全问题）
 * Created by Administrator on 2017/3/27 0027.
 */
public class Singleton {

    private Singleton(){

    }

    private static class SingletonFactory {

        private static Singleton instance = new Singleton();

    }

    public static Singleton  getInstance(){
        return SingletonFactory.instance;
    }
}
