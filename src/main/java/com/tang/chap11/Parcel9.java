package com.tang.chap11;

/**
 * @Classname Parcel
 * @Description
 * @Date 2022/8/8 23:05
 * @Author by tangyao
 */
public class Parcel9 {
    // 要在匿名内部类使用，参数必须是最终变量，或者实际上的最终变量
    public Destination destination(final String dest) {
        return new Destination() {


            private String label = dest;

            @Override
            public String readLabel() {
                return label;
            }
        };
    }

    public static void main(String[] args) {
        Parcel9 parcel9 = new Parcel9();
        Destination d = parcel9.destination("Tasmania");
        System.out.println("d = " + d);
    }

}
