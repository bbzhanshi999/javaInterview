package com.myspring.core;

/**
 * Created by Administrator on 2018/6/12.
 */
public class Property {

    private String name;
    private String value;
    private String ref;

    public Property(String name, String value,String ref) {
        this.name = name;
        this.value = value;
        this.ref = ref;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getValue() {
        return value;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }
}
