package com.tang.chap12;

import java.util.Arrays;

/**
 * @Classname ArrayIsNotIterable
 * @Description
 * @Date 2022/8/30 23:21
 * @Author by tangyao
 */
public class ArrayIsNotIterable {
    static <T> void test(Iterable<T> ib) {
        for (T t : ib) {
            System.out.print(t + " ");
        }
    }

    public static void main(String[] args) {
        test(Arrays.asList(1, 2, 3));
        String[] strings = {"A", "B", "C"};
        // 数组可以配合for-in使用，但是没有实现Iterable接口
//        test(strings);
        test(Arrays.asList(strings));
    }

}
