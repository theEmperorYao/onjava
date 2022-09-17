package com.tang.chap14;

import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Classname Generator
 * @Description
 * @Date 2022/9/7 22:00
 * @Author by tangyao
 */
public class Generator implements Supplier<String> {
    Random random = new Random(47);
    char[] letters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

    @Override
    public String get() {
        return "" + letters[random.nextInt(letters.length)];
    }

    public static void main(String[] args) {
        String word = Stream.generate(new Generator()).limit(30).collect(Collectors.joining());
        System.out.println("word = " + word);
    }

}
