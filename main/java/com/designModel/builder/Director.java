package com.designModel.builder;

import com.designModel.builder.impl.BenzModel;
import com.designModel.builder.impl.BenzModelBuilder;

import java.util.ArrayList;

/**
 * Created by Administrator on 2017/3/27 0027.
 */
public class Director {

    private ArrayList<String> sequence = new ArrayList<>();
    private BenzModelBuilder benzBuilder = new BenzModelBuilder();

    public BenzModel getBenzModelB(){
        this.sequence.clear();
        this.sequence.add("start");
        this.sequence.add("stop");
        return (BenzModel) benzBuilder.getCarModel(sequence);
    }


    public BenzModel getBenzModelA(){
        this.sequence.clear();
        this.sequence.add("engine boom");
        this.sequence.add("start");
        this.sequence.add("stop");
        return (BenzModel) benzBuilder.getCarModel(sequence);
    }


}
