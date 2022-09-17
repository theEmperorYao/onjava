package com.tang.chap14;

import static com.tang.chap14.RandInts.rands;

/**
 * @Classname NumericStreamInfo
 * @Description
 * @Date 2022/9/17 10:06
 * @Author by tangyao
 */
public class NumericStreamInfo {
    public static void main(String[] args) {
        System.out.println(rands().average().getAsDouble());
        System.out.println(rands().max().getAsInt());
        System.out.println(rands().min().getAsInt());
        System.out.println(rands().sum());
        System.out.println(rands().summaryStatistics());
    }
}
