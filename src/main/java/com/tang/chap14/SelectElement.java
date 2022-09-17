package com.tang.chap14;

import static com.tang.chap14.RandInts.rands;

/**
 * @Classname SelectElement
 * @Description
 * @Date 2022/9/17 09:54
 * @Author by tangyao
 */
public class SelectElement {

    public static void main(String[] args) {
        System.out.println(rands().findFirst().getAsInt());
        System.out.println(rands().parallel().findFirst().getAsInt());
        System.out.println(rands().findAny().getAsInt());
        System.out.println(rands().parallel().findAny().getAsInt());

    }
}
