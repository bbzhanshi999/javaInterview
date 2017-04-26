package com.designModel.iterator;

import com.designModel.observer.Observer;

/**
 * Created by jilili on 2017/3/30.
 */
public interface Iterator {

    public boolean hasNext();

    public Object next();
    public Object first();
    public Object previous();
}
