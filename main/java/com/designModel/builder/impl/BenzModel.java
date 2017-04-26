package com.designModel.builder.impl;

import com.designModel.builder.GeneralCarModel;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class BenzModel extends GeneralCarModel{


    @Override
    public void start() {
        System.out.println("Benz is Running");
    }

    @Override
    public void stop() {
        System.out.println("Benz is stopping");
    }

    @Override
    public void alarm() {
        System.out.println("Benz is alarming");
    }

    @Override
    public void engineBoom() {
        System.out.println("Benz's engine is booming");
    }

}
