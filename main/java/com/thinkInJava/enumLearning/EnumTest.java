package com.thinkInJava.enumLearning;

/**
 * 枚举测试
 * Created by jilili on 2017/4/9.
 */
public class EnumTest {

    public static void main(String[] args) {
        for (Money money : Money.values()) {
            System.out.println(money + ",ordinal:" + money.ordinal());
            switch (money) {
                case ONE:
                    System.out.println("one yuan");
                    break;
                case TWO:
                    System.out.println("two yuan");
                    break;
                case FIVE:
                    System.out.println("five yuan");
                    break;
                case TEN:
                    System.out.println("ten yuan");
                    break;
                case TWENTY:
                    System.out.println("twenty yuan");
                    break;
                case FIFTY:
                    System.out.println("fifty yuan");
                    break;
                default:
                    System.out.println("one hundred yuan");
            }
        }

    }


}
