package com.tang.chap14;

import java.util.Optional;
import java.util.stream.Stream;

/**
 * @Classname OptionalBasics
 * @Description
 * @Date 2022/9/14 21:54
 * @Author by tangyao
 */
public class OptionalBasics {
    static void test(Optional<String> optString) {
        if (optString.isPresent()) {
            System.out.println(optString.get());
        } else {
            System.out.println("Nothing inside");
        }
    }

    public static void main(String[] args) {
        test(Stream.of("Epithets").findFirst());
        test(Stream.<String>empty().findFirst());
    }
}
