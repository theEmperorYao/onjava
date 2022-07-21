package com.tang.chap8;

/**
 * @Classname Beetle
 * @Description TODO
 * @Date 2022/7/21 22:45
 * @Author by tangyao
 */
class Insert {
    private int i = 9;
    protected int j;

    Insert() {
        System.out.println("i=" + i + ",j=" + j);
        j = 39;
    }

    private static int x1 = printInt("static insect.x1 initialized");

    static int printInt(String s) {
        System.out.println(s);
        return 47;
    }
}

public class Beetle extends Insert {

    private int k = printInt("Beetle.k initialized");

    protected Beetle() {
        System.out.println("k=" + k);
        System.out.println("j=" + j);
    }

    private static int x2 = printInt("static Beetle.x2 initialized");

    public static void main(String[] args) {
        System.out.println("Beetle constructor");
        Beetle b = new Beetle();
    }
}
