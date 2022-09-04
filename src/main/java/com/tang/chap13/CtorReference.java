package com.tang.chap13;

/**
 * @Classname CtorReference
 * @Description
 * @Date 2022/9/3 10:45
 * @Author by tangyao
 */
class Dog {
    String name;
    int age = 1;

    Dog() {
        name = "stray";
    }

    Dog(String nm) {
        name = nm;
    }

    Dog(String nm, int yrs) {
        name = nm;
        age = yrs;
    }

}

interface MakeNorArgs {
    Dog make();
}

interface Make1Args {
    Dog make(String nm);
}

interface Make2Args {
    Dog make(String nm, int age);
}

public class CtorReference {
    MakeNorArgs mna = () -> new Dog();
    Make1Args m1a = a -> new Dog(a);
    Make2Args m2a = (a, b) -> new Dog(a, b);
    Dog dn = mna.make();
    Dog d2 = m1a.make("Comet");
    Dog d3 = m2a.make("Ralph", 4);
}
