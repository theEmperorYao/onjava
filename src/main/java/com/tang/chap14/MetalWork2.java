package com.tang.chap14;

import com.tang.chap10.Operation;

import java.util.Arrays;

/**
 * @Classname MetalWork2
 * @Description
 * @Date 2022/9/7 22:40
 * @Author by tangyao
 */
public class MetalWork2 {
    public static void main(String[] args) {
        Arrays.stream(new Operation[]{
                () -> Operation.show("Heat"),
                () -> Operation.show("Hammer"),
                () -> Operation.show("Twist"),
                () -> Operation.show("Anneal")
        }).forEach(Operation::execute);
        Arrays.stream(new int[]{1, 3, 5, 7, 15, 28, 37}, 3, 6)
                .forEach(n -> System.out.format("%d ", n));

    }
}
