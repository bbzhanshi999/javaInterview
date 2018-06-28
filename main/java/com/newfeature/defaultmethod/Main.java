package com.newfeature.defaultmethod;

import org.junit.Test;

/**
 * Created by Administrator on 2017/4/26 0026.
 */
public class Main {
    public static void main(String[] args) {
        DefaultMethod method= new DefaultMethodImpl();
        method.sout("wori");

        // default不算接口需要实现的方法，因此照样可以使用lamada表达式
        lamadaWrite("worinima", () -> { System.out.println();});
    }


    /**
     * default不算接口需要实现的方法，因此照样可以使用lamada表达式
     */
    @Test
    public static void lamadaWrite(String str,DefaultMethod method){
        method.sout(str);
    }
}
