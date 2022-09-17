package com.tang.chap14;

import java.util.Random;

/**
 * @Classname Randoms
 * @Description
 * @Date 2022/9/6 07:21
 * @Author by tangyao
 */
public class Randoms {
    public static void main(String[] args) {
        new Random(47)
                .ints(5, 20)
                .distinct()
                .limit(7)
                .sorted()
                .forEach(System.out::println);
    }
}
