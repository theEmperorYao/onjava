package com.tang.chap14;

import java.util.stream.IntStream;

/**
 * @Classname Rangs
 * @Description
 * @Date 2022/9/6 08:29
 * @Author by tangyao
 */
public class Rangs {
    public static void main(String[] args) {
        int result = 0;
        for (int i : IntStream.range(10, 20).toArray()) {
            result += i;
        }
        System.out.println("result = " + result);

        int sum = IntStream.range(10, 20).sum();
        System.out.println("sum = " + sum);

    }
}
