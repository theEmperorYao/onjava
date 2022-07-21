package com.tang.chap8;

import java.util.Arrays;
import java.util.Random;

/**
 * @Classname FinalTest
 * @Description TODO
 * @Date 2022/7/21 22:14
 * @Author by tangyao
 */

class Value {
    int i;

    Value(int i) {
        this.i = i;
    }
}

public class FinalData {

    private static Random random = new Random(47);
    private String id;

    public FinalData(String id) {
        this.id = id;
    }

    public final int valueOne = 9;
    private static final int VALUE_TWO = 99;

    public static final int VALUE_THREE = 39;


    private final int i4 = random.nextInt(20);
    static final int INT_5 = random.nextInt(20);
    private Value v1 = new Value(22);
    private final Value v2 = new Value(22);
    private static final Value VAL_3 = new Value(33);
    /**
     * 数组
     */
    private final int[] a = {1, 2, 3, 4, 5, 6};

    @Override
    public String toString() {
        return id + ":" + "i4 = " + i4 + ",INT_5=" + INT_5;
    }

    public static void main(String[] args) {
        FinalData fd1 = new FinalData("fd1");
//        fd1.valueOne++;
        fd1.v2.i++;
        fd1.v1 = new Value(9);
//        fd1.v2 = new Value(9);
        for (int i = 0; i < fd1.a.length; i++) {
            System.out.println(++fd1.a[i]);
        }
//        fd1.VAL_3 = new Value(1);
//        fd1.a = new int[3];
        System.out.println(fd1);
        System.out.println("Creating new FinaData");
        FinalData fd2 = new FinalData("fd2");
        System.out.println(fd1);
        System.out.println(fd2);


    }

}
