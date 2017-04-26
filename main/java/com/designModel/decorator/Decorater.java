package com.designModel.decorator;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class Decorater implements Sourceable {

    private Sourceable sourceable;

    public Decorater(Sourceable sourceable){
        super();
        this.sourceable = sourceable;
    }

    @Override
    public void method() {
        System.out.println("before method running");
        this.sourceable.method();
        System.out.println("after method running");
    }


}
