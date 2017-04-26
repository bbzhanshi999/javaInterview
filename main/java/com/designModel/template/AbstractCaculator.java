package com.designModel.template;

/**
 * Created by jilili on 2017/3/29.
 */
public abstract class AbstractCaculator {

    public final int caculate(String exp,String opt){
        String[] arr= opt.split(exp);
        int a = Integer.parseInt(arr[0]);
        int b = Integer.parseInt(arr[1]);
        return caculate(a,b);
    }

    public abstract int caculate(int a,int b);
}
