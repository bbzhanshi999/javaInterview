package com.designModel.observer;


import com.designModel.observer.impl.MySubject;
import com.designModel.observer.impl.Observer1;
import com.designModel.observer.impl.Observer2;

/**
 * Created by jilili on 2017/3/29.
 */
public class Test  {

    @org.junit.Test
    public void Test(){
        Subject subject =new MySubject();
        subject.add(new Observer1());
        subject.add(new Observer2());
        subject.operation();
    }
}
