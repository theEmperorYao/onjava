package com.tang.chap14;

import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Classname StreamOfRandoms
 * @Description
 * @Date 2022/9/12 08:30
 * @Author by tangyao
 */
public class StreamOfRandoms {
    static Random random = new Random(47);

    public static void main(String[] args) {

        Stream.of(1, 2, 3, 4, 5)
                .flatMapToInt(i -> IntStream.concat(
                        random.ints(0, 100).limit(1),
                        IntStream.of(-1)))
                .forEach(n -> System.out.format("%d ", n));
    }
}
