package com.tang.chap14.test;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname Test
 * @Description
 * @Date 2022/9/15 21:31
 * @Author by tangyao
 */
public class Test {

    public static void main(String[] args) {

        double sum = 100_0000;

        for (int i = 0; i < 5; i++) {
            sum = sum / 2.1;
        }

        List<Double> list = new ArrayList<>();

        int x = 1;
        for (int i = 0; i < 5; i++) {
            list.add(sum(x, i));
        }

        Double reduce = list.stream().reduce(0.0, Double::sum);

        System.out.println("reduce = " + reduce);
        System.out.println(100 / 6.105);

        double a = 16.38;
        double d = 0.0;
        for (int i = 0; i < 5; i++) {
            d += a * Math.pow(1.1, i);
        }
        System.out.println("d = " + d);

    }

    public static double sum(double x, int time) {
        for (int i = 1; i <= time; i++) {
            x = x * 1.1;
        }
        return x;
    }

}
