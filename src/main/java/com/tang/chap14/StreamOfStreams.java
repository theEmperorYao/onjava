package com.tang.chap14;

import java.util.stream.Stream;

/**
 * @Classname StreamOfStreams
 * @Description
 * @Date 2022/9/12 08:23
 * @Author by tangyao
 */
public class StreamOfStreams {
    public static void main(String[] args) {
        Stream.of(1, 2, 3)
                .map(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .map(e -> e.getClass().getName())
                .forEach(System.out::println);

        Stream.of(1, 2, 3)
                .flatMap(i -> Stream.of("Gonzo", "Kermit", "Beaker"))
                .forEach(System.out::println);


    }
}
