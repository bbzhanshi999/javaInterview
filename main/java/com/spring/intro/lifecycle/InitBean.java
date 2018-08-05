package com.spring.intro.lifecycle;

public class InitBean {

    private String name;

    public InitBean(){
        super();
        System.out.println("constructor is processed");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        System.out.println("property been setted");
        this.name = name;
    }

    public void init(){
        System.out.println("bean is init");
    }

    public void destroy(){
        System.out.println("bean is destroy");
    }
}
