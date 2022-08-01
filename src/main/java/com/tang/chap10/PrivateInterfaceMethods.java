package com.tang.chap10;

/**
 * @Classname PrivateInterfaceMethods
 * @Description TODO
 * @Date 2022/8/1 22:27
 * @Author by tangyao
 */

interface Old {
    default void fd() {
        System.out.println("Old::fd()");
    }

    static void fs() {
        System.out.println("Old::fs()");
    }

    default void f() {
        fd();
    }

    static void g() {
        fs();
    }
}

class ImplOld implements Old {

}

interface JDK9 {
    /**
     * 自动是default的
     */
    private void fd() {
        System.out.println("JDK9::fd()");
    }

    private static void fs() {
        System.out.println("JDK9::fs()");
    }

    default void f() {
        fd();
    }

    static void g() {
        fs();
    }

}

class ImplJDK9 implements JDK9 {

}

public class PrivateInterfaceMethods {

    public static void main(String[] args) {

        new ImplOld().f();
        Old.g();
        new ImplJDK9().f();
        JDK9.g();
    }
}
