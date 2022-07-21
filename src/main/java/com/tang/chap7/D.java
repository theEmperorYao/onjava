package com.tang.chap7;

import com.tang.chap4.C;
import com.tang.chap8.Beetle;

/**
 * @Classname D
 * @Description TODO
 * @Date 2022/7/17 13:05
 * @Author by tangyao
 */
public class D extends C {

    static class E extends Beetle {

    }

    public static void main(String[] args) {
        D d = new D();
        String x = d.a;
        E e = new E();
    }

}
