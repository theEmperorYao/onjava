package com.tang.chap14;

import java.util.Arrays;
import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Classname RandInts
 * @Description
 * @Date 2022/9/17 08:16
 * @Author by tangyao
 */
public class RandInts {
    private static int[] rints = new Random(47)
            .ints(0, 1000).limit(100).toArray();

    public static IntStream rands() {
        return Arrays.stream(rints);
    }



}
