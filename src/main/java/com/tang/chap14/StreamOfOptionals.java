package com.tang.chap14;

import java.util.Optional;

/**
 * @Classname StreamOfOptionals
 * @Description
 * @Date 2022/9/14 23:24
 * @Author by tangyao
 */
public class StreamOfOptionals {
    public static void main(String[] args) {
        Singal.stream()
                .limit(10)
                .forEach(System.out::println);

        Singal.stream()
                .limit(10)
                .filter(Optional::isPresent)
                .map(Optional::get)
                .forEach(System.out::println);
    }
}
