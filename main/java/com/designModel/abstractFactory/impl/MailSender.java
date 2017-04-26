package com.designModel.abstractFactory.impl;

import com.designModel.abstractFactory.Sender;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class MailSender implements Sender {
    @Override
    public void send() {
        System.out.println("This is a Mail sender");
    }
}
