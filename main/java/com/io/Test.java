package com.io;

import java.io.*;

/**
 * Created by Administrator on 2017/3/31 0031.
 */
public class Test {

    @org.junit.Test
    public void test1(){
        ObjectOutputStream  fos = null;
        try {
            fos = new ObjectOutputStream(new FileOutputStream("1.txt"));
            TestBean testBean = new TestBean();
            fos.writeObject(testBean);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (fos != null) {
                    fos.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
