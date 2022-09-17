package com.tang.chap14;

import java.util.stream.Stream;

/**
 * @Classname Duplicator
 * @Description
 * @Date 2022/9/7 22:13
 * @Author by tangyao
 */
public class Duplicator {
    public static void main(String[] args) {
        Stream.generate(() -> "duplicate").limit(3).forEach(System.out::println);
    }
}
