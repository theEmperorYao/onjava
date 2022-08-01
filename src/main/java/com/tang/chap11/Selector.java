package com.tang.chap11;

/**
 * @Classname Selector
 * @Description TODO
 * @Date 2022/8/1 23:28
 * @Author by tangyao
 */
 interface Selector {

    boolean end();

    Object current();

    void next();
}
