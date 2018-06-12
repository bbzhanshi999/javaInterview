package com.myspring;

import com.myspring.core.ApplicationXmlContext;
import com.spring.beans.Foo;

/**
 * Created by Administrator on 2018/6/12.
 */
public class Demo {


    public static void main(String[] args) {
        ApplicationXmlContext context = new ApplicationXmlContext("myspring.xml");
        Foo foo = (Foo) context.getBean("foo");
        System.out.println(foo.getBar());
    }
}
