package com.designModel.abstractFactory.impl;

import com.designModel.abstractFactory.Provider;
import com.designModel.abstractFactory.Sender;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class MailSenderFactory implements Provider {

    @Override
    public Sender produce() {
        return new MailSender();
    }
}
