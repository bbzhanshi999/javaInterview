package com.designModel.builder.impl;

import com.designModel.builder.CarBuilder;
import com.designModel.builder.CarModel;

import java.util.ArrayList;

/**
 * 奔驰建造者
 * Created by Administrator on 2017/3/27 0027.
 */
public class BenzModelBuilder implements CarBuilder {

    private ArrayList<String> sequence;

    @Override
    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }

    @Override
    public CarModel getCarModel() {
        BenzModel model = new BenzModel();
        model.setSequence(this.sequence);
        return model;
    }

    @Override
    public CarModel getCarModel(ArrayList<String> sequence) {
        BenzModel model = new BenzModel();
        model.setSequence(sequence);
        return model;
    }
}
