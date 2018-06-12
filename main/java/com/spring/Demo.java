package com.spring;

import com.spring.beans.Bar;
import com.spring.configs.AppConfig;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Created by Administrator on 2018/6/12.
 */
public class Demo {

    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);
        Bar bar  = (Bar) ctx.getBean("bar");
        System.out.println(bar.getFoo());
    }
}
