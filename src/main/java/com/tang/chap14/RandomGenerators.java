package com.tang.chap14;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @Classname RandomGenerators
 * @Description
 * @Date 2022/9/6 08:06
 * @Author by tangyao
 */
public class RandomGenerators {
    public static <T> void show(Stream<T> stream) {
        stream.limit(4).forEach(System.out::println);
        System.out.println("+++++++++++");
    }

    public static void main(String[] args) {
        Random rand = new Random(47);
        show(rand.ints().boxed());
        show(rand.longs().boxed());
        show(rand.doubles().boxed());
        // 控制流的边界
        show(rand.ints(10, 20).boxed());
        show(rand.longs(50, 100).boxed());
        show(rand.doubles(20, 30).boxed());

        show(rand.ints(2).boxed());
        show(rand.longs(2).boxed());
        show(rand.doubles(2).boxed());


        show(rand.ints(3, 3, 9).boxed());
        show(rand.longs(3, 3, 9).boxed());
        show(rand.doubles(3, 3, 9).boxed());


    }

}
