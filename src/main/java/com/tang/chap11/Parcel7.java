package com.tang.chap11;

/**
 * @Classname Parcel7
 * @Description
 * @Date 2022/8/8 22:22
 * @Author by tangyao
 */
public class Parcel7 {
    public Contents contents() {
        return new Contents() {
            private int i = 11;

            @Override
            public int value() {
                return i;
            }
        };
    }

    public static void main(String[] args) {
        Parcel7 parcel7 = new Parcel7();
        Contents contents = parcel7.contents();

    }
}
