package com.tang.chap6;

/**
 * @Classname A
 * @Description TODO
 * @Date 2022/7/16 10:45
 * @Author by tangyao
 */
public class A {

    A() {
        System.out.println("父类构造方法");
    }

    {
        System.out.println("父类代码块");
    }

    static {
        System.out.println("父类静态代码块");
    }

    public static int i = 1;

}
