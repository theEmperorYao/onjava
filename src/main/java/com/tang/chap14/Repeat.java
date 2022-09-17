package com.tang.chap14;

import java.util.stream.IntStream;

/**
 * @Classname Repeat
 * @Description
 * @Date 2022/9/6 08:34
 * @Author by tangyao
 */
public class Repeat {
    public static void repeat(int n, Runnable action) {
        IntStream.range(0, n).forEach(i -> action.run());
    }

}
