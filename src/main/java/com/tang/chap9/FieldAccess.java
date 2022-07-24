package com.tang.chap9;

/**
 * @Classname Super
 * @Description TODO
 * @Date 2022/7/24 21:15
 * @Author by tangyao
 */

class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field =" + sup.field + ", sup.getField()=" + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field =" + sub.field + ", sub.getField()=" + sub.getField() + ", sup.getSuperField()=" + sub.getSuperField());

    }
}
