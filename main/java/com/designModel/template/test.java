package com.designModel.template;

import org.junit.Test;

import java.util.Iterator;

/**
 * Created by jilili on 2017/3/29.
 */
public class test {
    @Test
    public void test(){
        AbstractCaculator caculator = new Minus();
        System.out.println(caculator.caculate("\\-","1-2"));
    }
}
