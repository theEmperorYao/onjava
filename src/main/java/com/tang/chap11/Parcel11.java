package com.tang.chap11;

import java.awt.*;

/**
 * @Classname Parcel11
 * @Description
 * @Date 2022/8/8 23:22
 * @Author by tangyao
 */
public class Parcel11 {
    private static class ParcelContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }

        protected static final class ParcelDestination implements Destination {

            ParcelDestination(String whereTo) {
                label = whereTo;
            }

            private String label;

            @Override
            public String readLabel() {
                return label;
            }

            public static void f() {
            }

            static int x = 10;

            static class AnotherLevel {
                public static void f() {

                }

                static int x = 10;
            }

        }


    }

    public static Destination destination(String s) {
        return new ParcelContents.ParcelDestination(s);
    }

    public static Contents contents() {
        return new ParcelContents();
    }

    public static void main(String[] args) {
        Contents contents = contents();
        Destination tasmania = destination("Tasmania");
    }
}
