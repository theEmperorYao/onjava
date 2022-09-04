package com.tang.chap13;

import java.util.function.IntSupplier;

/**
 * @Classname Closure1
 * @Description
 * @Date 2022/9/4 14:13
 * @Author by tangyao
 */
public class Closure1 {

    /**
     * Java编译器实现的只是capture-by-value，并没有实现capture-by-reference。
     *
     * @param x
     * @return
     */
    IntSupplier makeFun(int x) {
        int i = 0;
        i++;
        x++;
        int finalX = x;
        int finalI = i;
        return () -> finalX + finalI;
    }

    public static void main(String[] args) {
        Closure1 closure1 = new Closure1();
        IntSupplier f1 = closure1.makeFun(0);
        IntSupplier f2 = closure1.makeFun(0);
        IntSupplier f3 = closure1.makeFun(0);
        System.out.println(f1.getAsInt());
        System.out.println(f2.getAsInt());
        System.out.println(f3.getAsInt());

    }
}
