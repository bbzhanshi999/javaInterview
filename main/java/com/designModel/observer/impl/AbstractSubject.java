package com.designModel.observer.impl;



import com.designModel.observer.Observer;
import com.designModel.observer.Subject;

import java.util.Enumeration;
import java.util.Vector;

/**
 * Created by jilili on 2017/3/29.
 */
public abstract class AbstractSubject implements Subject {


    protected Vector<Observer> observers = new Vector<>();

    @Override
    public void add(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void del(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver() {
        Enumeration<Observer> elements = observers.elements();
        while(elements.hasMoreElements()){
            Observer observer = elements.nextElement();
            observer.update();
        }
    }
}
