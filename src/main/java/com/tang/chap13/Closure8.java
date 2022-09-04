package com.tang.chap13;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Supplier;

/**
 * @Classname Closure8
 * @Description
 * @Date 2022/9/4 14:20
 * @Author by tangyao
 */
public class Closure8 {
    Supplier<List<Integer>> makeFun() {
        List<Integer> ai = new ArrayList<>();
        ai.add(1);
        return () -> ai;
    }

    public static void main(String[] args) {
        Closure8 closure8 = new Closure8();
        List<Integer> l1 = closure8.makeFun().get();
        List<Integer> l2 = closure8.makeFun().get();
        System.out.println(l1);
        System.out.println(l2);
        l1.add(42);
        l2.add(96);
        System.out.println(l1);
        System.out.println(l2);
    }
}
