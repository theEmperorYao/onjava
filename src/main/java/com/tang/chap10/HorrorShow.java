package com.tang.chap10;

/**
 * @Classname HorrorShow
 * @Description TODO
 * @Date 2022/7/30 11:49
 * @Author by tangyao
 */


interface Monster {
    void menace();
}

interface DangerousMonster extends Monster {
    void destroy();
}

interface Lethal {
    void kill();
}

class DragonZilla implements DangerousMonster {

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }
}

interface Vampire extends DangerousMonster, Lethal {
    void drinkBlood();
}

class VeryBadVampire implements Vampire{

    @Override
    public void menace() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void kill() {

    }

    @Override
    public void drinkBlood() {

    }
}


public class HorrorShow {
    static void u(Monster b){
        b.menace();
    }
    static void v(DangerousMonster d){
        d.menace();
        d.destroy();
    }

    static void w(Lethal l){
        l.kill();
    }

    public static void main(String[] args) {
        DragonZilla barney = new DragonZilla();
        u(barney);
        v(barney);
        VeryBadVampire veryBadVampire = new VeryBadVampire();
        u(veryBadVampire);
        v(veryBadVampire);
        w(veryBadVampire);
    }

}
