package com.tang.chap9;

/**
 * @Classname PrivateOverride
 * @Description TODO
 * @Date 2022/7/22 23:47
 * @Author by tangyao
 */
public class PrivateOverride {

    private void f() {
        System.out.println("private f()");
    }

    public static void main(String[] args) {
        PrivateOverride po = new Derived();
        po.f();
    }
}

class Derived extends PrivateOverride {
//    @Override
    public void f() {
        System.out.println("public f()");
    }
}
