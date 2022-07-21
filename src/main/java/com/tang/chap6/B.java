package com.tang.chap6;

/**
 * @Classname B
 * @Description TODO
 * @Date 2022/7/16 10:45
 * @Author by tangyao
 */
public class B extends A {

    B() {
        System.out.println("子类构造方法");
    }

    {
        System.out.println("子类代码块");
    }

    static {
        System.out.println("子类静态代码块");
    }

    public static void main(String[] args) {
        new B();
//        int i = A.i;
    }


}
