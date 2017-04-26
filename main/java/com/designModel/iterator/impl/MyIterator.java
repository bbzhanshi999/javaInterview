package com.designModel.iterator.impl;

import com.designModel.iterator.Collection;
import com.designModel.iterator.Iterator;

/**
 * Created by jilili on 2017/3/30.
 */
public class MyIterator implements Iterator {

    private Collection collection;
    private int position = -1;
    public MyIterator(Collection collection){
//        super();
        this.collection = collection;
    }

    @Override
    public boolean hasNext() {
        return position < collection.size() - 1;
    }

    @Override
    public Object next() {
        if(hasNext()){
            return collection.get(++position);
        }
        return null;
    }

    @Override
    public Object first() {
       return collection.get(0);
    }

    @Override
    public Object previous() {
        if(position>0){
            return(--position);
        }
        return null;
    }
}
