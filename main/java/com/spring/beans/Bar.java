package com.spring.beans;

/**
 * Created by Administrator on 2018/6/12.
 */
public class Bar {


    private String foo;

    public Bar() {
    }

    public Bar(String foo) {

        this.foo = foo;
    }

    public String getFoo() {
        return foo;
    }

    public void setFoo(String foo) {
        this.foo = foo;
    }
}
