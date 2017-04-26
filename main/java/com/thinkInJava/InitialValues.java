package com.thinkInJava;

/**
 * 参数初始化测试
 * Created by jilili on 2017/4/8.
 */
public class InitialValues {
    int a = getA();
    int b = getB(a);//b下面必须在a下面
    int c;

    static String str1 = "wocao";
    static String str2;

    static {
        str2 = "wori";
        System.out.println(str1+":"+str2);
    }

    static void print(){
        System.out.println(str1+":"+str2);
    }

    public InitialValues(int c) {
        //在构造方法赋值之前，基本类型初始化已经完成，此时c=0，之后才会赋新值
        System.out.println(b);
        this.c = c;
    }

    int getA(){
        return 11;
    }

    int getB(int a ){
        return a*90;
    }

    public static void main(String[] args) {
        /*InitialValues initialValues = new InitialValues();
        System.out.println(initialValues.a);
        System.out.println(initialValues.b);*/
//        new InitialValues(1);
        InitialValues.print();
        int b;//栈中的局部基本类型变量不会给初始化值，程序会报编译错误，
        System.out.println(b = 10);
    }
}
