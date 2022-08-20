package com.tang.chap11;

/**
 * @Classname MultiImplementation
 * @Description
 * @Date 2022/8/8 23:56
 * @Author by tangyao
 */

class D {
}

abstract class E {
}

class Z extends D {
    //解决多重继承问题
    // 1、内部类可以有多个实例，每个实例都有自己的状态信息，独立于外围类对象的信息
    // 2、一个外围类中可以有多个内部类，他们可以以不同方式实现一个接口，或者继承同一个类。
    //3、内部类对象的创建实际不与外围类对象的创建捆绑在一起
    //4、内部类不存在可能引起混淆的"is - a"关系；它是独立的个体
    E makeE() {
        return new E() {
        };
    }
}

public class MultiImplementation {
    static void takeD(D d) {

    }

    static void takeE(E e) {

    }

    public static void main(String[] args) {
        Z z = new Z();
        takeD(z);
        takeE(z.makeE());
    }

}
