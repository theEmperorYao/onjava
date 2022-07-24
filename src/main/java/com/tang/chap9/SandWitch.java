package com.tang.chap9;

import com.tang.chap4.C;

/**
 * @Classname SandWitch
 * @Description TODO
 * @Date 2022/7/24 21:39
 * @Author by tangyao
 */


class Meal {
    Meal() {
        System.out.println("Meal()");
    }
}

class Bread {
    Bread() {
        System.out.println("Bread()");
    }
}

class Cheese {
    Cheese() {
        System.out.println("Cheese()");
    }
}

class Lettuce {
    Lettuce() {
        System.out.println("Lettuce()");
    }
}

class Lunch extends Meal {
    Lunch() {
        System.out.println("Lunch()");
    }
}

class PortableLunch extends Lunch {
    PortableLunch() {
        System.out.println("PortableLunch()");
    }
}

public class SandWitch extends PortableLunch {
    private Bread b = new Bread();
    private Cheese c = new Cheese();
    private Lettuce l = new Lettuce();

    public SandWitch() {
        System.out.println("Sandwich()");
    }

    public static void main(String[] args) {
        // 基类构造器方法，成员变量，构造方法
        new SandWitch();
    }
}
