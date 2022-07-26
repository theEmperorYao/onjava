package com.tang.chap9;

/**
 * @Classname Transmpgrify
 * @Description TODO
 * @Date 2022/7/26 22:34
 * @Author by tangyao
 */


class Actor {
    public void act() {
    }
}

class HappyActor extends Actor {
    @Override
    public void act() {
        System.out.println("HappyActor");
    }
}

class SadActor extends Actor {
    @Override
    public void act() {
        System.out.println("SadActor");
    }
}

class Stage {
    private Actor actor = new HappyActor();

    public void change() {
        actor = new SadActor();
    }

    public void performPlay() {
        actor.act();
    }
}


public class Transmogrify {

    public static void main(String[] args) {

        // 使用继承来表达行为上的差异，使用字段来表达状态上的变化。
        Stage stage = new Stage();
        stage.performPlay();
        stage.change();
        stage.performPlay();
    }
}
