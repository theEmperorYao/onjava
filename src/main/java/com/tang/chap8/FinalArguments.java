package com.tang.chap8;

/**
 * @Classname FinalArguments
 * @Description TODO
 * @Date 2022/7/21 22:33
 * @Author by tangyao
 */

class Gizmo {
    public void spin() {

    }
}

public class FinalArguments {
    void with(final Gizmo gizmo) {
//        gizmo = new Gizmo();
    }

    void without(Gizmo gizmo) {
        gizmo = new Gizmo();
        gizmo.spin();
    }

    void f(final int i) {
//        i++;
    }

    int g(final int i) {
        return i + 1;
    }

    public static void main(String[] args) {
        FinalArguments bf = new FinalArguments();
        bf.without(null);
        bf.with(null);
    }

}
