package com.tang.chap14;

import java.util.stream.Stream;

/**
 * @Classname StreamOf
 * @Description
 * @Date 2022/9/6 07:33
 * @Author by tangyao
 */
public class StreamOf {
    public static void main(String[] args) {
        Stream.of(new Bubble(1), new Bubble(2), new Bubble(3))
                .forEach(System.out::println);

        Stream.of("It's ", "a ", "wonderful", "day", "for", "pie").forEach(System.out::println);

        System.out.println();
        Stream.of(3.14159, 2.718, 1.618).forEach(System.out::println);
    }
}
