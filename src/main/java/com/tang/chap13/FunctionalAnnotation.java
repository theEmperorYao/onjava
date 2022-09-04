package com.tang.chap13;

import java.util.function.Consumer;
import java.util.function.ObjIntConsumer;

/**
 * @Classname FunctionalAnnotation
 * @Description
 * @Date 2022/9/3 10:53
 * @Author by tangyao
 */

@FunctionalInterface
interface Functional {
    String goodbye(String arg);
}

interface FunctionalNoAnn {
    String goodbye(String arg);
}

public class FunctionalAnnotation {

    public String googbye(String arg) {
        return "Goodbye, " + arg;
    }

    public static void main(String[] args) {
        FunctionalAnnotation fa = new FunctionalAnnotation();
        Functional f = fa::googbye;
        FunctionalNoAnn fna = fa::googbye;

//        Functional f = fna;
    }
}
