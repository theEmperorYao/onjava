package com.tang.chap13;

import java.util.function.Function;

/**
 * @Classname CurryingAndPartials
 * @Description
 * @Date 2022/9/4 15:36
 * @Author by tangyao
 */
public class CurryingAndPartials {
    static String uncurried(String a, String b) {
        return a + b;
    }

    /**
     * 柯里化：将一个接受多个参数的函数转变为一系列只接受一个参数的函数
     *
     * @param args
     */
    public static void main(String[] args) {
        Function<String, Function<String, String>> sum = a -> b -> a + b;
        System.out.println(uncurried("Hi ", "Ho"));

        Function<String, String> hi = sum.apply("Hi ");
        System.out.println(hi.apply("Ho"));

        Function<String, String> sumHi = sum.apply("Hup ");

        System.out.println(sumHi.apply("Ho"));
        System.out.println(sumHi.apply("Hey"));

    }
}
