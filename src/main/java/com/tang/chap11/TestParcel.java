package com.tang.chap11;

/**
 * @Classname TestParcel
 * @Description TODO
 * @Date 2022/8/2 22:27
 * @Author by tangyao
 */

class Parcel4 {

    // private 内部类为类的设计者提供了一种方式，可以完全阻止任何与类型相关的编程依赖，并可以完全隐藏实现细节。
    private class PContents implements Contents {

        private int i = 11;

        @Override
        public int value() {
            return i;
        }
    }

    protected final class PDestination implements Destination {
        private String label;

        private PDestination(String whereTo) {
            label = whereTo;
        }

        @Override
        public String readLabel() {
            return label;
        }
    }

    public Destination destination(String s) {
        return new PDestination(s);
    }

    public Contents contents() {
        return new PContents();
    }

}

class SubParcel extends Parcel4 {
    public static void main(String[] args) {
        SubParcel subParcel = new SubParcel();
        PDestination aa = (PDestination) subParcel.destination("aa");
        subParcel.contents();
    }
}

public class TestParcel {

    public static void main(String[] args) {
        Parcel4 p = new Parcel4();
        //内部类PContents 是private 的，所以只有Parcel4能访问它,无法向下转型为private的内部类
        Contents c = p.contents();
        // PDestination 是protected的，可以被Parcel4，相同包中的类，Parcel4的子类访问
        // （除非有继承关系，否则也不能向下转型为protected的内部类）
        p.destination("Tasmania");
        // 非法，不能直接访问private类
//        Parcel4.PContents pContents = p.new PContents();

    }

}
