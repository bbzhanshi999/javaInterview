package com.designModel.proxy;


/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class Proxy implements Sourceable {

    private Source source;

    public Proxy() {
        super();
        this.source = new Source();
    }

    @Override
    public void method() {
        before();
        source.method();
        after();

    }

    public void after() {
        System.out.println("after from proxy");
    }

    public void before() {
        System.out.println("before from proxy");
    }
}
