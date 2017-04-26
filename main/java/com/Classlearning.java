package com;

import java.net.URISyntaxException;

/**
 * Created by Administrator on 2017/4/19 0019.
 */
public class Classlearning {

    public static void main(String[] args) throws URISyntaxException {
        String path = Classlearning.class.getResource("\\").toURI().getPath();
        System.out.println(path);
    }
}
