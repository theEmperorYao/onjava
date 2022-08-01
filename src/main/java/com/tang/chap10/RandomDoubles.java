package com.tang.chap10;

import java.util.Random;

/**
 * @Classname RandomDoubles
 * @Description TODO
 * @Date 2022/7/30 13:02
 * @Author by tangyao
 */
public interface RandomDoubles {
    Random RAND = new Random(47);

    default double next() {
        return RAND.nextDouble();
    }

    // 静态方法只能被接口调用，默认方法可以被实现类调用
    static double next1() {
        return RAND.nextDouble();
    }

    static void main(String[] args) {
        RandomDoubles rd = new RandomDoubles() {

        };
        for (int i = 0; i < 7; i++) {
            System.out.println(rd.next() + " ");
        }
    }
}
