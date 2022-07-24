package com.tang.chap9;

/**
 * @Classname StaticPolymorphism
 * @Description TODO
 * @Date 2022/7/24 21:29
 * @Author by tangyao
 */

class StaticSuper {
    public static String staticGet() {
        return "Base staticGet";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }

}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }

}


public class StaticPolymorphism {
    public static void main(String[] args) {

        StaticSuper sup = new StaticSub();
        System.out.println(StaticSuper.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
