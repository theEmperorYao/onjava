package com.tang.chap10;

import java.util.Optional;

/**
 * @Classname MetalWork
 * @Description TODO
 * @Date 2022/7/29 23:45
 * @Author by tangyao
 */

class Heat implements Operation {

    @Override
    public void execute() {

    }

    public static void main(String[] args) {

        Operation twist = new Operation() {
            @Override
            public void execute() {
                Operation.show("Twist");
            }
        };

        Operation.runOps(new Heat(), new Operation() {
            @Override
            public void execute() {
                Operation.show("Hammer");
            }
        }, twist::execute, () -> Operation.show("Anneal"));

    }
}

public class MetalWork {
    public static void main(String[] args) {

    }
}
