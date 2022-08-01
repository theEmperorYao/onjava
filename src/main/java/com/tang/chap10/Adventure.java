package com.tang.chap10;

/**
 * @Classname Adventure
 * @Description TODO
 * @Date 2022/7/30 11:40
 * @Author by tangyao
 */

interface CanFight {
    void fight();
}

interface CanSwim {
    void swim();
}

interface CanFly {
    void fly();
}

class ActionCharacter {
    public void fight() {
        System.out.println("ActionCharacter fight()");
    }
}

class Hero extends ActionCharacter implements CanFight, CanFly, CanSwim {

    @Override
    public void swim() {

    }

    @Override
    public void fly() {

    }
}

public class Adventure {
    public static void t(CanFight x) {
        x.fight();
    }

    public static void u(CanSwim x) {
        x.swim();
    }

    public static void v(CanFly x) {
        x.fly();
    }

    public static void w(ActionCharacter x) {
        x.fight();
    }

    public static void main(String[] args) {
        Hero hero = new Hero();
        t(hero);
        u(hero);
        v(hero);
        w(hero);
    }

}
