package com.tang.chap10;

/**
 * @Classname Processor
 * @Description TODO
 * @Date 2022/7/30 01:47
 * @Author by tangyao
 */

public interface Processor {
    default String name() {
        return getClass().getSimpleName();
    }

    Object process(Object input);
}
