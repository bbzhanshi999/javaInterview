package com.designModel.observer;

/**
 * Created by jilili on 2017/3/29.
 */
public interface Subject {

    public void add(Observer observer);

    public void del(Observer observer);

    public void notifyObserver();

    public void operation();
}
