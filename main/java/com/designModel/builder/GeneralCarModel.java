package com.designModel.builder;

import java.util.ArrayList;

/**
 * 实现run方法的抽象汽车类
 * Created by Administrator on 2017/3/27 0027.
 */
public abstract class GeneralCarModel implements CarModel{

    protected ArrayList<String> sequence;



    @Override
    public void run() {
        for (String actionName : this.sequence) { //根据ArrayList中保存的顺序执行相应的动作
            if (actionName.equalsIgnoreCase("start")) {
                this.start(); //启动汽车
            } else if (actionName.equalsIgnoreCase("stop")) {
                this.stop(); //停止汽车
            } else if (actionName.equalsIgnoreCase("alarm")) {
                this.alarm(); //汽车鸣笛
            } else if (actionName.equalsIgnoreCase("engine boom")) {
                this.engineBoom(); //汽车轰鸣
            }
        }
    }

    public void setSequence(ArrayList<String> sequence) {
        this.sequence = sequence;
    }
}
