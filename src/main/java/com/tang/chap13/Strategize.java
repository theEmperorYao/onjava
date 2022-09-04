package com.tang.chap13;

/**
 * @Classname Strategize
 * @Description
 * @Date 2022/9/1 08:17
 * @Author by tangyao
 */

interface Strategy {
    String approach(String msg);
}

class Soft implements Strategy {

    @Override
    public String approach(String msg) {
        return msg.toLowerCase() + "?";
    }

}

class Unrelated {
    static String twice(String msg) {
        return msg + " " + msg;
    }
}

public class Strategize {
    Strategy strategy;
    String msg;

    Strategize(String msg) {
        strategy = new Soft();
        this.msg = msg;
    }

    void communicate() {
        System.out.println(strategy.approach(msg));
    }

    void changeStrategy(Strategy strategy) {
        this.strategy = strategy;
    }

    public static void main(String[] args) {
        Strategy[] strategies = {
                new Strategy() {
                    @Override
                    public String approach(String msg) {
                        return msg.toLowerCase() + "!";
                    }
                },
                msg -> msg.substring(0, 5),
                Unrelated::twice
        };

        Strategize s = new Strategize("Hello there");
        s.communicate();
        for (Strategy strategy : strategies) {
            s.changeStrategy(strategy);
            s.communicate();
        }
    }
}
