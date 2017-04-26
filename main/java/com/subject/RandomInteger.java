package com.subject;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 *
 * Created by Administrator on 2017/4/7 0007.
 */
public class RandomInteger {

    public static void main(String[] args) {
        Random random = new Random();
//拿到四个随机数，可以做个池什么的每次取四个来提升效率
        List<Double> r = new ArrayList<>();
        for (int i = 0; i < 15; i++) {
            r.add(random.nextDouble());
        }
//排序
        r.sort(Double::compareTo);
//用这四个随机数来打断一个数，来取得五份分解之后的数
        int num = 100;
        List<Integer> out = new ArrayList<>();
        int last = 0;
        for (int i = 0; i < 15; i++) {
            int c = (int) (r.get(i) * num);
            out.add(c - last);
            last = c;
        }
        out.add(num - last);
        System.out.println(out);
    }
}
