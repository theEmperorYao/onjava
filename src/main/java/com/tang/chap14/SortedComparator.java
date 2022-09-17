package com.tang.chap14;

import java.util.Comparator;

/**
 * @Classname SortedComparator
 * @Description
 * @Date 2022/9/10 22:04
 * @Author by tangyao
 */
public class SortedComparator {
    public static void main(String[] args) throws Exception {
        FileToWords.stream(RandomWords.path)
                .skip(10)
                .limit(10)
                .sorted(Comparator.reverseOrder())
                .map(w -> w + " ")
                .forEach(System.out::println);
    }
}
