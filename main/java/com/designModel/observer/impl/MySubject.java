package com.designModel.observer.impl;



/**
 * Created by jilili on 2017/3/29.
 */
public class MySubject extends AbstractSubject {


    @Override
    public void operation() {
        System.out.println("operation is doing");
        notifyObserver();
    }
}
