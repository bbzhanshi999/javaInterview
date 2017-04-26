package com.thinkInJava;

import java.util.Arrays;

/**
 * 可变参数
 * Created by jilili on 2017/4/9.
 */
public class VariablesArgs {


    public static void var1(Object... args) {
        for (Object obj : args) {
            System.out.print(obj + ",");
        }
        System.out.println("");
    }

    public static void var2(Integer integer, Object... args) {
        System.out.println(integer);
        for (Object obj : args) {
            System.out.print(obj + ",");
        }
        System.out.println("");
    }

    public static void varInt(int... args) {
        System.out.println(args.getClass());
    }

    public static void func(String... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void func(Integer... args) {
        System.out.println(Arrays.toString(args));
    }

    public static void func(Integer integer, String... args) {
        System.out.println(integer);
        System.out.println(Arrays.toString(args));
    }


   /* public static void main(String[] args) {
        var1(1,2,3,4,5,6);
        var1(new Object[]{1,2,3,4,5,6});
        var1(new Integer[]{1,2,3,4,5,6});//此处编译器会发出警告
        var1((Object[]) new Integer[]{1,2,3,4,5,6});
        var1((Object) new Integer[]{1,2,3,4,5,6});//显式的高速编译器不是以一个数据传入方法，而是一个对象
        var1(new Integer[]{1,2,3,4,5,6},1,2,3,4);//显式的高速编译器不是以一个数据传入方法，而是一个对象

        var2(1);
        var2(1,1,2,3,45);
        var2(1,"String",'c',1L,1,new Object());
        var2(1,new Object[]{3,4,5,6,7,"wocao"});

        varInt(1,2,3,4,5);
        varInt();

        //func();//由于可变参数函数有两个重载，所以无法实现空参调用，因为无法知道调用哪个；
    }*/

    /**
     * 实现可变参数的main函数
     * @param args
     */
    public static void main(String... args) {
        System.out.println(Arrays.toString(args));
        System.out.println(args.length);
    }
}
