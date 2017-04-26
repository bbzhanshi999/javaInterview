package com.designModel.abstractFactory.impl;

import com.designModel.abstractFactory.Sender;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class SMSSender implements Sender {
    @Override
    public void send() {
        System.out.println("send a SMS message");
    }
}
