package com.tang.chap13;

/**
 * @Classname MultiUnbound
 * @Description
 * @Date 2022/9/3 10:26
 * @Author by tangyao
 */

class This {
    void two(int i, double d) {
    }

    void three(int i, double d, String s) {

    }

    void four(int i, double d, String s, char c) {
    }
}

interface TwoArgs {
    void call2(This athis, int i, double d);
}

interface ThreeArgs {
    void call3(This athis, int i, double d, String s);
}

interface FourArgs {
    void call4(This athis, int i, double d, String s, char c);
}

/**
 * 未绑定方法引用 指的是尚未关联到某个对象的普通方法。对于未绑定引用，必须先提供对象，然后才能使用
 */
public class MultiUnbound {
    public static void main(String[] args) {
        TwoArgs twoArgs = This::two;
        ThreeArgs threeArgs = This::three;
        FourArgs fourArgs = This::four;
        This athis = new This();
        twoArgs.call2(athis, 11, 3.14);
        threeArgs.call3(athis, 11, 3.14, "Three");
        fourArgs.call4(athis, 11, 3.14, "four", 'Z');

    }
}
