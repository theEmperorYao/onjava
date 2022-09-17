package com.tang.chap14;

import java.util.Random;
import java.util.stream.Stream;

/**
 * @Classname Frobnitz
 * @Description
 * @Date 2022/9/17 09:21
 * @Author by tangyao
 */
public class Frobnitz {
    int size;

    Frobnitz(int sz) {
        size = sz;
    }

    @Override
    public String toString() {
        return "Frobnitz{" +
                "size=" + size +
                '}';
    }

    static Random random = new Random(47);

    static final int BOUND = 100;

    static Frobnitz supply() {
        return new Frobnitz(random.nextInt(BOUND));
    }
}

class Reduce {
    public static void main(String[] args) {
        Stream.generate(Frobnitz::supply)
                .limit(10)
                .peek(item -> System.out.println("item: " + item))
                .reduce((fr0, fr1) -> fr0.size < 50 ? fr0 : fr1)
                .ifPresent(System.out::println);
    }
}
