package com;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/4/1 0001.
 */
public class test {

    public static void main(String[] args) {
        Map<String,String> map = new HashMap<>();
        map.put("1","yi");
        System.out.println(map.get("1"));
        System.out.println(map.size());
        map.put("1","一");
        System.out.println(map.get("1"));
        System.out.println(map.size());
    }
}
