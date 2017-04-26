package com.thinkInJava.permission;

/**
 * 如果子类无公开构造器，将不可被继承
 * Created by jilili on 2017/4/9.
 */
public class SubFactory extends Factory {
    public SubFactory(int a) {
        super(a);
    }
}
