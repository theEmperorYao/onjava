package com.tang.chap10.filters;

/**
 * @Classname Filter
 * @Description TODO
 * @Date 2022/7/30 01:32
 * @Author by tangyao
 */
public class Filter {
    public String name() {
        return getClass().getSimpleName();
    }

    public WaveForm process(WaveForm input) {
        return input;
    }

}
