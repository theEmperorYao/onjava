package com.tang.chap14;

import java.util.stream.Stream;

/**
 * @Classname Bubble
 * @Description
 * @Date 2022/9/6 07:32
 * @Author by tangyao
 */
public class Bubble {

    public final int i;

    public Bubble(int n) {
        i = n;
    }

    @Override
    public String toString() {
        return "Bubble(" + i + ")";
    }

    private static int count = 0;

    public static Bubble bubbler() {
        return new Bubble(count++);
    }

    public static void main(String[] args) {
        Stream.generate(Bubble::bubbler)
                .limit(5)
                .forEach(System.out::println);
    }

}
