package com.other.lamda;

/**
 * 测试匿名内部类和lamda中this 分别代表什么
 */
public class ThisTest {


    private String name="thisTest";

    public  void twoThread(){

        new Thread(new Runnable() {
            private String name="runnable";
            @Override
            public void run() {
                System.out.println(this.name);
                System.out.println(this.getClass());
            }
        }).start();


        new Thread(()-> {
            System.out.println(this.name);
            System.out.println(this.getClass());
        }).start();
    }


    public static void main(String[] args) {
        ThisTest thisTest = new ThisTest();
        thisTest.twoThread();
    }
}
