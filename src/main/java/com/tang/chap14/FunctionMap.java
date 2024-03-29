package com.tang.chap14;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Classname FunctionMap
 * @Description
 * @Date 2022/9/10 22:25
 * @Author by tangyao
 */
public class FunctionMap {
    static String[] elements = {"12", "", "23", "45"};

    static Stream<String> testStream() {
        return Arrays.stream(elements);
    }

    static void test(String descr, Function<String, String> func) {
        System.out.println("---(" + descr + ")---");
        testStream().map(func).forEach(System.out::println);
    }

    public static void main(String[] args) {
        test("add brackets", s -> "[" + s + "]");
        test("Increment", s -> {
            try {
                return Integer.parseInt(s) + 1 + "";
            } catch (NumberFormatException e) {
                return s;
            }
        });

    }

}

