package com.newfeature.lamada;

import org.junit.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class LamadaLearning {

    @Test
    public void collectionsSort(){
        List<String> list = Arrays.asList("wori","this","today","monday");
        //Collections.sort(list, String::compareTo);
        Collections.sort(list,(a,b)->a.compareTo(b));
    }
}
