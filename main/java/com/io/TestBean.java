package com.io;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class TestBean implements Serializable {

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
