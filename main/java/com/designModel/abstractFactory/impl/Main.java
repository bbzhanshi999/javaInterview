package com.designModel.abstractFactory.impl;

import com.designModel.abstractFactory.Provider;
import com.designModel.abstractFactory.Sender;

/**
 * 抽象工厂模式
 * Created by Administrator on 2017/3/27 0027.
 */
public class Main {
    public static void main(String[] args) {
        Provider provider = new SMSSenderFactory();
        Sender sender = provider.produce();
        sender.send();
    }
}
