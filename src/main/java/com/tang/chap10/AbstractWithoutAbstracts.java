package com.tang.chap10;

/**
 * @Classname AbstractWithoutAbstracts
 * @Description TODO
 * @Date 2022/7/26 23:21
 * @Author by tangyao
 */

abstract class Basic2 extends Basic {
    int f() {
        return 111;
    }

    abstract void g();
}

abstract class Basic3 {
    int f() {
        return 111;
    }
}


public class AbstractWithoutAbstracts {

    public static void main(String[] args) {
//        Basic3 basic3 = new Basic3();// Basic3是抽象的，不能实例化
    }

}
