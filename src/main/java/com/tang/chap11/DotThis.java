package com.tang.chap11;

import com.tang.chap7.D;

/**
 * @Classname DoThis
 * @Description TODO
 * @Date 2022/8/1 23:48
 * @Author by tangyao
 */
public class DotThis {

    void f() {
        System.out.println("DotTHis.f()");
    }

    public class Inner {
        public DotThis outer() {
            // 生成外部类对象的引用的写法，该引用会自动拥有正确的类型，而且是编译时确定并检查的，所以没有任何运行时开销。
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.inner();
        inner.outer().f();
    }
}
