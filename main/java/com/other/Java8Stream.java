package com.other;

import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * Created by Administrator on 2017/4/4 0004.
 */
public class Java8Stream {

    @Test
    public void map(){
        List<Person> list = new ArrayList<>();
        Map<String,Person> map = new HashMap<>();
        for(int x = 0;x<10;x++){
            list.add(new Person("name:"+x,x*10,"红旗村"+x+"栋"));
        }
        list = list.stream().filter(person -> person.getAge()>50).collect(Collectors.toList());
        list.forEach(person -> System.out.println(person.getName()+":"+person.getAge()));
    }
}
