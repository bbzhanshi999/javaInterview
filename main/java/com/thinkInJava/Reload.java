package com.thinkInJava;

/**
 * 重载练习
 * Created by jilili on 2017/4/8.
 */
public class Reload {

    public void print(int a, String b) {
        System.out.println("int first");
    }

    public void print(String a, int b) {
        System.out.println("String first");
    }

    public static void main(String[] args) {
        Reload reload = new Reload();
        reload.print("a",1);
        reload.print(1,"a");
    }
}
