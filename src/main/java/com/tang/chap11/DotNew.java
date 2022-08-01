package com.tang.chap11;

/**
 * @Classname DotNew
 * @Description TODO
 * @Date 2022/8/1 23:52
 * @Author by tangyao
 */
public class DotNew {
    public class Inner {
    }

    public static void main(String[] args) {
        DotNew dotNew = new DotNew();
        // 让其他某个对象来创建他的某个内部类的对象。
        Inner inner = dotNew.new Inner();

    }
}
