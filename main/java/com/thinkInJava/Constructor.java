package com.thinkInJava;

/**
 * 构造器函数互相调用
 * Created by jilili on 2017/4/8.
 */
public class Constructor {

    public Constructor() {
        System.out.println("无参数构造函数");
    }

    public Constructor(int a ){
        this();
//        super();//构造函数中调用构造函数只能调用一次，并且必须放在语句最前面一行
        System.out.println("int 构造函数");
    }

    public static void main(String[] args) {
        new Constructor(2);
//        System.out.println(this);
    }

}
