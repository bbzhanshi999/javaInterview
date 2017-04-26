package com.thinkInJava.permission;

/**
 * 用于测试protected仍然具有包权限
 * Created by jilili on 2017/4/9.
 */
public class ProtectedTest {

    /**
     * 除了继承类可以调用父类的protected方法之外，位于同一个包内的其他成员类也可以调用protected方法
     */
    public void useProtectedMethod(){
        Human human = new Human();
        human.printName();
    }

    public static void main(String[] args) {
        ProtectedTest protectedTest = new ProtectedTest();
        protectedTest.useProtectedMethod();
    }
}
