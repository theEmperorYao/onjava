package com.tang.chap12;

import java.util.Map;

/**
 * @Classname Employee
 * @Description
 * @Date 2022/8/29 22:25
 * @Author by tangyao
 */
public record Employee(String name, int id) {
}

class BasicRecord {
    public static void main(String[] args) {
        var bob = new Employee("Bob Dobbs", 11);
        var dot = new Employee("Dorothy Gale", 9);
        System.out.println("bob.id() = " + bob.id());
        System.out.println("bob.name() = " + bob.name());
        System.out.println("bob = " + bob);

        var map = Map.of(bob, "A", dot, "B");
        System.out.println("map = " + map);


    }
}

record FinalFields(int i) {
    int timeTen() {
        return i * 10;
    }

    void tryToChange() {
//        i++;
    }

}

record Company(Employee[] e) {
}

// record默认是final的，record 也不能继承其他类
//class Conglomerate extends Company{}

interface Star {
    double brightness();

    double density();
}

// record会自动生成brightness参数的一个访问器，正好匹配Star接口的density()
record RedDwarf(double brightness) implements Star {

    @Override
    public double density() {
        return 100.0;
    }

    public static void main(String[] args) {
        RedDwarf redDwarf = new RedDwarf(10);
        System.out.println("redDwarf.density() = " + redDwarf.density());
        System.out.println("redDwarf.brightness() = " + redDwarf.brightness());

    }
}




