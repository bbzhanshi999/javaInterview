package com.designModel.iterator.impl;

import com.designModel.iterator.Collection;
import com.designModel.iterator.Iterator;

/**
 * Created by jilili on 2017/3/30.
 */
public class MyCollection implements Collection {

    String arr[] = {"1","2","3","4","5","6","7"};

    @Override
    public Iterator iterator() {

        return new MyIterator(new MyCollection());
    }

    @Override
    public Object get(int i) {
        return arr[i];
    }

    @Override
    public int size() {
        return arr.length;
    }
}
