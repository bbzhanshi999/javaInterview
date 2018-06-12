package com.spring.configs;

import com.spring.beans.Bar;
import com.spring.beans.Foo;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

/**
 * Created by Administrator on 2018/6/12.
 */
@Configuration
@ComponentScan(basePackages = {"com.spring.configs"})
public class AppConfig {


    @Bean
    public Foo foo(){
        return new Foo();
    }

    @Bean
    public Bar bar(){
        Bar bar = new Bar();
        bar.setFoo("this is foo");
        return bar;
    }


}
