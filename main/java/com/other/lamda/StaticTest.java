package com.other.lamda;

import java.util.function.Function;
import java.util.function.IntUnaryOperator;

public class StaticTest {

    public static int staticMethod(int i){
        return i*2;
    }


    public  int dynamicMethod(int i){
        return i*2;
    }


    public static void main(String[] args) {
        IntUnaryOperator staticMethod = StaticTest::staticMethod;
        System.out.println(staticMethod.applyAsInt(111));


        StaticTest st = new StaticTest();
        Function<Integer, Integer> dynamicMethod = st::dynamicMethod;
        System.out.println(dynamicMethod.apply(111));
    }
}
