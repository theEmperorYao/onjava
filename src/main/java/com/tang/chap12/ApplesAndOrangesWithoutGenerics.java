package com.tang.chap12;

import java.util.ArrayList;

/**
 * @Classname ApplesAndOrangesWithoutGenerics
 * @Description
 * @Date 2022/8/21 01:30
 * @Author by tangyao
 */

class Apple {
    private static long counter;
    private final long id = counter++;

    public long id() {
        return id;
    }
}

class Orange {

}

class GrannySmith extends Apple {

}

public class ApplesAndOrangesWithoutGenerics {
    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        ArrayList<Apple> apples = new ArrayList<>();
        for (int i = 0; i < 3; i++) {
            apples.add(new Apple());
            apples.add(new GrannySmith());
        }
//        apples.add(new Orange());
        for (Apple apple : apples) {

            System.out.println(apple);
        }
    }
}
