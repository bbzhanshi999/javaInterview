package com.referenceType;

import java.io.Serializable;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class TestBean implements Serializable{

    private static final long serialVersionUID = 1L;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
