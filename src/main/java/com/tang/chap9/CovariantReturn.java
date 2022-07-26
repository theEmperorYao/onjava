package com.tang.chap9;

/**
 * @Classname Grain
 * @Description TODO
 * @Date 2022/7/26 22:19
 * @Author by tangyao
 */

class Grain {
    @Override
    public String toString() {
        return "Grain";
    }
}

class Wheat extends Grain {
    @Override
    public String toString() {
        return "Wheat";
    }
}

class Mill {
    Grain process() {
        return new Grain();
    }
}

class WheatMill extends Mill {
    @Override
    Wheat process() {
        return new Wheat();
    }
}

/**
 * 协变返回类型
 */
public class CovariantReturn {

    public static void main(String[] args) {
        Mill mill = new Mill();
        Grain g = mill.process();
        System.out.println(g);

        mill = new WheatMill();
        g = mill.process();

        System.out.println(g);
    }

}
