package com.tang.chap10;

/**
 * @Classname Operatoin
 * @Description TODO
 * @Date 2022/7/29 23:38
 * @Author by tangyao
 */
public interface Operation {

    void execute();

    static void runOps(Operation... ops) {
        for (Operation op : ops) {
            op.execute();
        }
    }

    static void show(String msg) {
        System.out.println(msg);
    }
}
