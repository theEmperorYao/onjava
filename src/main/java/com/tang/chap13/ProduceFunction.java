package com.tang.chap13;

import java.util.function.Function;

/**
 * @Classname ProduceFunction
 * @Description
 * @Date 2022/9/3 20:16
 * @Author by tangyao
 */

interface FuncSS extends Function<String, String> {
}

public class ProduceFunction {
    static FuncSS produce() {
        return String::toLowerCase;
    }

    public static void main(String[] args) {
        FuncSS f = produce();
        System.out.println(f.apply("YELLING"));
    }

}
