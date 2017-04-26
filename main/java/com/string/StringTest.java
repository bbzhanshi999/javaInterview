package com.string;

/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class StringTest {

    public static void main(String[] args) {
        String a= "a,b,c,d,e f g h j";
        String[] b = a.split(",| ");
        for(String str:b){
            System.out.println(str);
        }
        String[] aa = "aaa\\bbb\\bccc".split("\\\\");
        for(String str:aa){
            System.out.println(str);
        }
    }
}
