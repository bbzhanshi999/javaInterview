package com.thinkInJava.permission;

/**
 * 测试private构造器的类无法被继承
 * Created by jilili on 2017/4/9.
 */
public class Factory {
    int a ;
    private Factory(){

    }

    public Factory(int a ){
        this.a = a ;
    }

    public Factory makeFactory(){
        return new Factory();
    }
}
