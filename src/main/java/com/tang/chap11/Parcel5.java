package com.tang.chap11;

/**
 * @Classname Parcel5
 * @Description TODO
 * @Date 2022/8/2 22:59
 * @Author by tangyao
 */
public class Parcel5 {
    private class PContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    public Destination destination(String s) {

        // 局部内部类
        final class PDestination implements Destination {

            private String label;

            private PDestination(String whereTo) {
                label = whereTo;
            }

            @Override
            public String readLabel() {
                return label;
            }
        }

        return new PDestination(s);

    }

    public Contents contents() {
        return new PContents();
    }

    public static void main(String[] args) {

    }
}
