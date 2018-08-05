package com.myspring.beans;

public class Driver {

    private Car car;

    public void drive(){
        System.out.println("drive car:"+car.getClass().getName());
        car.run();
    }

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }
}
