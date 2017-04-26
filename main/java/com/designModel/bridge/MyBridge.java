package com.designModel.bridge;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class MyBridge implements Bridge,Sourceable {

    private Sourceable sourceable;


    @Override
    public Sourceable getSource() {
        return sourceable;
    }

    @Override
    public void setSource(Sourceable source) {
        this.sourceable = source;
    }

    @Override
    public void method() {
        sourceable.method();
    }
}
