package com.tang.chap11;

/**
 * @Classname MultiInterfaces
 * @Description
 * @Date 2022/8/8 23:51
 * @Author by tangyao
 */

interface A {

}

interface B {

}

class X implements A, B {

}

class Y implements A {
    B makeB() {
        return new B() {

        };
    }
}


public class MultiInterfaces {

    static void testA(A a) {

    }

    static void testB(B b) {

    }

    public static void main(String[] args) {
        X x = new X();
        Y y = new Y();
        testA(x);
        testA(y);
        testB(x);
        testB(y.makeB());
    }

}
