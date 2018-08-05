package com.spring.intro.factorybean;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("classpath:springContext/factoryBean-context.xml");
        Car car = (Car) context.getBean("car");
        System.out.println(car);
        context.close();
    }
}
