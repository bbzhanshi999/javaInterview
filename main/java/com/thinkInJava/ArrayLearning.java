package com.thinkInJava;

import org.junit.Test;

import java.util.Arrays;

/**
 * 数组学习
 * Created by jilili on 2017/4/9.
 */
public class ArrayLearning {


    @Test
    public void func1(){
        int[] arr;
        arr= new int[(int) (Math.random()*10)];
        System.out.println(Arrays.toString(arr));
        System.out.println(arr.length);
    }
}
