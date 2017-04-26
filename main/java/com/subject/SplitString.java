package com.subject;

/**
 * 编写一个截取字符串的函数，输入为一个字符串和字节数，输出为按字节截
 * 取的字符串，但要保证汉字不被截取半个，如“我 ABC”， 4，应该截取“我 AB”，
 * 输入“我 ABC 汉 DEF”， 6，应该输出“我 ABC”，而不是“我 ABC+汉的半个”。
 * Created by Administrator on 2017/3/31 0031.
 */
public class SplitString {
    public static void main(String[] args) throws Exception {
        String str = "我aaa爱中华ab我爱传智def";
        //String str ="我ABC汉";
        int num = trimGBK(str.getBytes("GBK"), 5);
        int num2 = trimUTF8(str.getBytes("UTF-8"), 5);
        System.out.println(str.substring(0, num));
        System.out.println(str.substring(0, num2));
    }

    public static int trimGBK(byte[] buf, int n) {
        int num = 0;
        boolean bChineseFirstHalf = false;
        for (int i = 0; i < n; i++) {
            if (buf[i] < 0 && !bChineseFirstHalf) {
                bChineseFirstHalf = true;
            } else {
                num++;
                bChineseFirstHalf = false;
            }
        }
        return num;
    }

    public static int trimUTF8(byte[] buf,int n){
        int num = 0, pos = 0;
        for (int i = 0; i < n; i++) {
            if(buf[i]<0&&pos<2){
                pos++;
            }else if(buf[i]<0&&pos==2){
                pos = 0;
                num++;
            }else{
                pos = 0;
                num++;
            }
        }
        return num;
    }

}
