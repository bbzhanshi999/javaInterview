package com.newfeature.trywithresource;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

/**
 * JDK7 Try-With-Resources特性
 * Created by Administrator on 2017/4/25 0025.
 */
public class Main {

    public static void main(String[] args) {

        try (InputStream fis = new FileInputStream("d:\\adcfg.json");
             OutputStream fos = new FileOutputStream("d:\\2.json")){

            byte[] buf = new byte[8192];

            int i;
            while ((i = fis.read(buf)) != -1) {
                fos.write(buf, 0, i);
            }
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
