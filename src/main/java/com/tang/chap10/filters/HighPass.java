package com.tang.chap10.filters;

/**
 * @Classname HighPass
 * @Description TODO
 * @Date 2022/7/30 01:34
 * @Author by tangyao
 */
public class HighPass extends Filter {
    double cutoff;

    public HighPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}
