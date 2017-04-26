package com.designModel.iterator;

import com.designModel.iterator.impl.MyCollection;

/**
 *
 * Created by jilili on 2017/3/30.
 */
public class Test {


    @org.junit.Test
    public void test(){
        Collection collection = new MyCollection();
        Iterator iterator = collection.iterator();
        System.out.println(iterator.hasNext());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.previous());
    }


}
