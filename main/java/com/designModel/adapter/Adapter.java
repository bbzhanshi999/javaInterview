package com.designModel.adapter;

/**
 * 类适配器模式，通过继承原类并且实现一个接口
 * Created by Administrator on 2017/3/28 0028.
 */
public class Adapter extends Source implements Targetable{



    @Override
    public void method2() {
        System.out.println("This is a Adapter method");
    }
}
