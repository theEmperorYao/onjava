package com.tang.chap10;

/**
 * @Classname Instantiable
 * @Description TODO
 * @Date 2022/7/26 23:23
 * @Author by tangyao
 */

abstract class Uninstantiable {
    abstract void f();

    abstract int g();

}

public class Instantiable extends Uninstantiable {
    @Override
    void f() {
        System.out.println("f()");
    }

    @Override
    int g() {
        return 22;
    }

    public static void main(String[] args) {
        Uninstantiable ui = new Instantiable();
    }
}


