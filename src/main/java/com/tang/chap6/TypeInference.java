package com.tang.chap6;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @Classname TypeInference
 * @Description TODO
 * @Date 2022/7/17 12:45
 * @Author by tangyao
 */
public class TypeInference {

    void method() {
        var hello = "hello";


        BiFunction<Integer, Integer, Integer> f = Integer::sum;



    }
}
