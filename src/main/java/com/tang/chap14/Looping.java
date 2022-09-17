package com.tang.chap14;

/**
 * @Classname Looping
 * @Description
 * @Date 2022/9/6 08:36
 * @Author by tangyao
 */
public class Looping {
    static void hi() {
        System.out.println("Hi!");
    }

    public static void main(String[] args) {
        Repeat.repeat(3, () -> System.out.println("Looping"));
        Repeat.repeat(3, Looping::hi);

    }
}
