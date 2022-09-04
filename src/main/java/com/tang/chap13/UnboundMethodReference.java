package com.tang.chap13;

import java.util.function.Function;

/**
 * @Classname UnboundMethodReference
 * @Description
 * @Date 2022/9/3 10:16
 * @Author by tangyao
 */

class X {
    String f() {
        return "X::f()";
    }
}

interface MakeString {
    String make();
}

interface TransformX{
    String transform(X x);

}

public class UnboundMethodReference {
    public static void main(String[] args) {
        TransformX sp = X::f;
        X x = new X();
        System.out.println(sp.transform(x));
        System.out.println(x.f());
    }
}
