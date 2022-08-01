package com.tang.chap11;

/**
 * @Classname Parcel3
 * @Description TODO
 * @Date 2022/8/1 23:57
 * @Author by tangyao
 */
public class Parcel3 {
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

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        //必须使用外部类的实例，来创建内部类的实例
        Contents contents = parcel3.new Contents();
        Destination tasmania = parcel3.new Destination("Tasmania");
        // 除非已经有了一个外部类对象，否则创建内部类对象是不可能的，这是因为内部类的对象会暗中连接到用于创建它的外部类对象。
        // 然而，如果你创建的是嵌套类（static修饰的内部类，他就不需要指向外部类对象的引用）
    }
}
