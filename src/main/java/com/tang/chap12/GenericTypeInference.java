package com.tang.chap12;

import com.tang.chap6.A;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * @Classname GenericTypeInference
 * @Description
 * @Date 2022/8/21 01:37
 * @Author by tangyao
 */
public class GenericTypeInference {
    void old() {
        ArrayList<Apple> apples = new ArrayList<>();
    }

    void modern() {
        var apples = new ArrayList<Apple>();
    }

    static void pitFall() {
        var apples = new ArrayList<>();
        apples.add(new Apple());
        System.out.println("apples.get(0) = " + apples.get(0));

    }

    public static void main(String[] args) {
        pitFall();

        List<String> list = Arrays.asList("a", "b", "c");
    }
}
