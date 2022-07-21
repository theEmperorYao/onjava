package com.tang.chap8;

/**
 * @Classname Bath
 * @Description TODO
 * @Date 2022/7/17 14:32
 * @Author by tangyao
 */

class Soap {

    private String s;

    Soap() {
        System.out.println("Soap()");
        s = "Constructed";
    }

    @Override
    public String toString() {
        return s;
    }
}


public class Bath {
    private String s1 = "Happy", s2 = "Happy", s3, s4;
    private Soap castile;
    private int i;
    private float toy;

    public Bath() {
        System.out.println("Inside Bath()");
        s3 = "Joy";
        toy = 3.14f;
        castile = new Soap();
    }

    {
        i = 47;
    }

    @Override
    public String toString() {
        return "Bath{" +
                "s1='" + s1 + '\'' +
                ", s2='" + s2 + '\'' +
                ", s3='" + s3 + '\'' +
                ", s4='" + s4 + '\'' +
                ", castile=" + castile +
                ", i=" + i +
                ", toy=" + toy +
                '}';
    }

    public static void main(String[] args) {
        Bath bath = new Bath();
        System.out.println(bath);
    }
}
