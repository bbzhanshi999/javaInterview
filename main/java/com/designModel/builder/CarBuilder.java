package com.designModel.builder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public interface CarBuilder {

    public void setSequence(ArrayList<String> sequence);

    public CarModel getCarModel();

    public CarModel getCarModel(ArrayList<String> sequence);
}
