package com.tang.chap11;


/**
 * @Classname AnonymousConstructor
 * @Description
 * @Date 2022/8/8 23:10
 * @Author by tangyao
 */

abstract class Base {
    Base(int i) {
        System.out.println("Base constructor,i=" + i);
    }

    public abstract void f();
}

public class AnonymousConstructor {
    public static Base getBase(int i) {
        return new Base(i) {
            @Override
            public void f() {
                System.out.println("In anonymous f()");
            }
        };
    }

    public static void main(String[] args) {
        Base base = getBase(47);
        base.f();
    }
}
