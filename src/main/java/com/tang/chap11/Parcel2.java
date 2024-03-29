package com.tang.chap11;

import java.text.DecimalFormat;

/**
 * @Classname Pacel2
 * @Description TODO
 * @Date 2022/8/1 23:20
 * @Author by tangyao
 */
public class Parcel2 {


    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {

        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public Destination to(String s) {
        return new Destination(s);
    }

    public Contents contents() {
        return new Contents();
    }

    public void ship(String dest) {
        Contents c = contents();
        Destination d = to(dest);
        System.out.println(d.readLabel());
    }

    public static void main(String[] args) {
        Parcel2 p = new Parcel2();
        p.ship("Tasmania");
        Parcel2 q = new Parcel2();
        //定义指向内部类的引用
        Contents c = q.contents();
        Destination d = q.to("Borneo");
    }


}
