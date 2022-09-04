package com.tang.chap13;

/**
 * @Classname RecursiveFactorial
 * @Description
 * @Date 2022/9/1 08:32
 * @Author by tangyao
 */

interface IntCall {
    int call(int arg);
}

public class RecursiveFactorial {
    static IntCall fact;

    public static void main(String[] args) {
        fact = n -> n == 0 ? 1 : n * fact.call(n - 1);
        for (int i = 0; i < 10; i++) {
            System.out.println(fact.call(i));
        }
    }

}
