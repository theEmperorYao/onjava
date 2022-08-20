package com.tang.chap11;

/**
 * @Classname Parcel8
 * @Description
 * @Date 2022/8/8 22:25
 * @Author by tangyao
 */

class Wrapping {
    private int i;

    public Wrapping(int x) {
        i = x;
    }

    public int value() {
        return i;
    }
}

public class Parcel8 {
    public Wrapping wrapping(int x) {
        return new Wrapping(x) {
            @Override
            public int value() {
                return super.value() * 47;
            }
        };
    }

    public static void main(String[] args) {
        Parcel8 parcel8 = new Parcel8();
        Wrapping wrapping = parcel8.wrapping(10);
        int value = wrapping.value();
        System.out.println("value = " + value);
    }
}
