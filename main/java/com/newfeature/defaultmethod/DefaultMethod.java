package com.newfeature.defaultmethod;

/**
 * java8 default特性
 * Created by Administrator on 2017/4/26 0026.
 */
public interface DefaultMethod {

    public void sout();


    public default void sout(String str){
        System.out.println(str);
    }
}
