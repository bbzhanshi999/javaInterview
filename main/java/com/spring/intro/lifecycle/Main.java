package com.spring.intro.lifecycle;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {


    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:lifecycle-demo-context.xml");
        context.getBean("initBean");
        context.close();
    }
}
