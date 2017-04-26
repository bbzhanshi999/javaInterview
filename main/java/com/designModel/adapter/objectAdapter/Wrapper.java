package com.designModel.adapter.objectAdapter;

import com.designModel.adapter.Source;
import com.designModel.adapter.Targetable;

/**
 * Created by Administrator on 2017/3/28 0028.
 */
public class Wrapper  implements Targetable {

    private Source source;


    public Wrapper(Source source){
        super();
        this.source =source;
    }

    @Override
    public void method1() {
        source.method1();
    }

    @Override
    public void method2() {
        System.out.println("This is a Wrapper method");
    }
}
