package com.tang.chap14;

import java.util.function.BiPredicate;
import java.util.function.Predicate;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * @Classname Matching
 * @Description
 * @Date 2022/9/17 09:37
 * @Author by tangyao
 */

interface Matcher extends BiPredicate<Stream<Integer>, Predicate<Integer>> {

}

public class Matching {
    static void show(Matcher match, int val) {
        System.out.println(match.test(
                IntStream.rangeClosed(1, 9)
                        .boxed()
                        .peek(n -> System.out.printf("%d ", n)),
                n -> n < val
        ));
    }

    public static void main(String[] args) {
        show((integerStream, predicate) -> integerStream.allMatch(predicate), 10);
        show(Stream::allMatch, 4);
        show(Stream::anyMatch, 2);
        show(Stream::anyMatch, 0);
        show(Stream::noneMatch, 5);
        show(Stream::noneMatch, 0);
    }
}
