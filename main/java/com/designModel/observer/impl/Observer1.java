package com.designModel.observer.impl;


import com.designModel.observer.Observer;

/**
 * Created by jilili on 2017/3/29.
 */
public class Observer1 implements Observer {
    @Override
    public void update() {
        System.out.println("update from Observer1");
    }
}
