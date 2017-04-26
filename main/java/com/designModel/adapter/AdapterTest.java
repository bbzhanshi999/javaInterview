package com.designModel.adapter;

import com.designModel.adapter.objectAdapter.Wrapper;
import org.junit.Test;

/**
 * 测试类
 * Created by Administrator on 2017/3/28 0028.
 */
public class AdapterTest {

    @Test
    public void test1(){
        Wrapper wrapper = new Wrapper(new Source());
        wrapper.method1();
        wrapper.method2();
    }

    @Test
    public void test2(){
        Adapter adapter = new Adapter();
        adapter.method1();
        adapter.method2();
    }

}
