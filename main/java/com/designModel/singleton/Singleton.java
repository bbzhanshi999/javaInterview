package com.designModel.singleton;

/**
 * 懒汉式单例
 * Created by Administrator on 2017/3/27 0027.
 */
public class Singleton {

    /**
     * 构造函数私有化
     */
    private Singleton(){}

    private static Singleton instance= null;

    public static Singleton getInstance(){
        if(instance==null){
            synchronized (instance){
                //同步代码块并不能保证程序不出错，因为有可能线程创建了一个空白区域（也即是有了引用，但是没有真对象），但是并没有初始化，导致另一线程进入时出错
                if(instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
