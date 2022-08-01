package com.tang.chap10.filters;

/**
 * @Classname WaveForm
 * @Description TODO
 * @Date 2022/7/30 01:31
 * @Author by tangyao
 */
public class WaveForm {
    private static long counter;
    private final long id = counter++;

    @Override
    public String toString() {
        return "Wareform " + id;
    }
}
