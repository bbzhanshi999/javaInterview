package com.generic;

import java.util.ArrayList;
import java.util.List;

/**
 * 泛型<? extends E>于<? super E>的区别
 * Created by jilili on 2017/3/30.
 */
public class UpperAndLowerBound {

    private List<? extends Fruit> fruits;
    private List<Fruit> fruits1;
    private List<? super Apple> fruits2;

    public List<Fruit> getFruits1() {
        return fruits1;
    }

    public void setFruits1(List<Fruit> fruits1) {
        this.fruits1 = fruits1;
    }


    public List<? extends Fruit> getFruits() {
        return fruits;
    }

    public void setFruits(List<? extends Fruit> fruits) {
        this.fruits = fruits;
    }


    public List<? super Apple> getFruits2() {
        return fruits2;
    }

    public void setFruits2(List<? super Apple> fruits2) {
        this.fruits2 = fruits2;
    }

    public static void main(String[] args) {
        /*UpperAndLowerBound bound = new UpperAndLowerBound();
        bound.setFruits(new ArrayList<Apple>());
        bound.setFruits(new ArrayList<Fruit>());
        //bound.setFruits(new ArrayList<Object>());<? extends Fruit>限制了上限，只有fruit的子类可以被声明，<?>是<? extends Object>的简称

        bound.setFruits1(new ArrayList<Fruit>());
        //bound.setFruits1(new ArrayList<Apple>());<Fruit>声明了只能是Fruit类

        bound.setFruits2(new ArrayList<Apple>());
        bound.setFruits2(new ArrayList<Fruit>());
        bound.setFruits2(new ArrayList<Object>());*/
        //bound.setFruits2(new ArrayList<RedApple>());<? super Apple>闲置了下限，只有apple的父类可以被声明

        Object a =display3("this is a name ");
        String b =display3("this is a name ");
        Integer c = display3("this is a name ");
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

    }

    public static <T> T display3(String name) {

        return (T)name;
    }

    public static <T,J> T display2(T t,J j) {
        System.out.println(t.getClass());
        System.out.println(j.getClass());
        return t;
    }

    public static <T> void display(T t) {
        System.out.println(t.getClass());
    }
}
