package com.tang.chap12;

/**
 * @Classname NestedLocalRecords
 * @Description
 * @Date 2022/8/29 22:49
 * @Author by tangyao
 */
public class NestedLocalRecords {
    record Nested(String s) {
    }

    void method() {
        record Local(String s) {
        }
    }
}

record Point(int x, int y) {
    void assertPositive(int val) {
        if (val < 0) {
            throw new IllegalArgumentException("negative");
        }
    }

    //紧凑构造器
    Point {//紧凑没有参数列表
        assertPositive(x);
        assertPositive(y);
    }

    public static void main(String[] args) {
        Point point = new Point(1, -12);
    }

}

record PlusTen(int x) {
    PlusTen {
        // 对于字段的调整只能在构造器中
        x += 10;
    }

    public static void main(String[] args) {
        PlusTen plusTen = new PlusTen(19);
        System.out.println("plusTen.x() = " + plusTen.x());

    }
}

// record Value(int x) 会生成一个名为x的final字段，当使用非紧凑构造器时，这个字段不会被初始化。
record Value(int x) {
    Value(int x) {
        this.x = x;
    }
}

record R(int a, double b, char c) {
}

class CopyRecord {
    public static void main(String[] args) {
        var r1 = new R(11, 2.2, 'z');
        var r2 = new R(r1.a(), r1.b(), r1.c());
        // 要复制一个record，必须显示地将所有字段都传给其构造器
        // 创建record 编译器会为其自动生成equals()方法,这个方法可以确保副本与原来的对象等同
        System.out.println(r1.equals(r2));
    }
}
