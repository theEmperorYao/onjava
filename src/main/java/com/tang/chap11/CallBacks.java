package com.tang.chap11;

/**
 * @Classname CallBacks
 * @Description
 * @Date 2022/8/17 22:05
 * @Author by tangyao
 */

interface Incrementable {
    void increment();
}

class Callee1 implements Incrementable {

    private int i = 0;

    @Override
    public void increment() {
        i++;
        System.out.println(i);
    }
}

class MyIncrement {
    public void increment() {
        System.out.println("other operation");
    }

    static void f(MyIncrement myIncrement) {
        myIncrement.increment();
    }
}

class Callee2 extends MyIncrement {
    private int i = 0;

    @Override
    public void increment() {
        super.increment();
        i++;
        System.out.println(i);
    }

    private class Closure implements Incrementable {
        @Override
        public void increment() {
            System.out.println("哈哈");
            // 创建内部类，并没有增加或修改外围类的接口
            Callee2.this.increment();
            System.out.println("嘻嘻");
        }
    }

    Incrementable getCallbackReference() {
        // 接口与实现完全分离
        return new Closure();
    }

}

class Caller {
    private Incrementable callbackReference;

    Caller(Incrementable cbh) {
        callbackReference = cbh;
    }

    void go() {
        callbackReference.increment();
    }
}


public class CallBacks {

    public static void main(String[] args) {
        Callee1 callee1 = new Callee1();
        Callee2 callee2 = new Callee2();
        MyIncrement.f(callee2);
        Caller caller1 = new Caller(callee1);
        Caller caller2 = new Caller(callee2.getCallbackReference());
        caller1.go();
        caller1.go();
        caller2.go();
        caller2.go();

    }
}
