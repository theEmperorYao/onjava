package com.tang.chap14;

/**
 * @Classname Peeking
 * @Description
 * @Date 2022/9/7 23:04
 * @Author by tangyao
 */
public class Peeking {
    public static void main(String[] args) throws Exception {
        FileToWords.stream(RandomWords.path)
                .skip(21)
                .limit(4)
                .map(w -> w + " ")
                .peek(System.out::print)
                .map(String::toLowerCase)
                .forEach(System.out::print);
    }
}
