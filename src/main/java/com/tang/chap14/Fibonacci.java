package com.tang.chap14;

import java.util.stream.Stream;

/**
 * @Classname Fibonacci
 * @Description
 * @Date 2022/9/7 22:19
 * @Author by tangyao
 */
public class Fibonacci {

    int x = 1;

    // 0 1 1 2 3 5 8
    // 其实一开始x的位置在 0 前面
    // 1 0 1 1 2 3 5 8
    Stream<Integer> numbers() {
        return Stream.iterate(0, i -> {
            int result = x + i;
            x = i;
            return result;
        });
    }

    public static void main(String[] args) {
        new Fibonacci().numbers()
                .skip(20)
                .limit(10)
                .forEach(System.out::println);
    }

}
