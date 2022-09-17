package com.tang.chap14;

import static com.tang.chap14.RandInts.rands;

/**
 * @Classname ForEach
 * @Description
 * @Date 2022/9/17 08:19
 * @Author by tangyao
 */
public class ForEach {
    static final int SZ = 14;

    public static void main(String[] args) {
        rands().limit(SZ).forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEach(n -> System.out.printf("%d ", n));
        System.out.println();
        rands().limit(SZ)
                .parallel()
                .forEachOrdered(n -> System.out.printf("%d ", n));
    }
}
