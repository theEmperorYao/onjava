package com.tang.chap13;

/**
 * @Classname RecursiveFibonacci
 * @Description
 * @Date 2022/9/1 08:39
 * @Author by tangyao
 */
public class RecursiveFibonacci {
    IntCall fib;

    RecursiveFibonacci() {
        fib = n -> n == 0 ? 0 :
                n == 1 ? 1 :
                        fib.call(n - 1) + fib.call(n - 2);
    }

    int fibonacci(int n) {
        return fib.call(n);
    }

    public static void main(String[] args) {
        RecursiveFibonacci recursiveFibonacci = new RecursiveFibonacci();
        for (int i = 0; i < 10; i++) {
            int fibonacci = recursiveFibonacci.fibonacci(i);
            System.out.println("fibonacci = " + fibonacci);
        }
    }
}
