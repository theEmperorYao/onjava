package com.tang.chap10.filters;

/**
 * @Classname LowPass
 * @Description TODO
 * @Date 2022/7/30 01:33
 * @Author by tangyao
 */
public class LowPass extends Filter {

    double cutoff;

    public LowPass(double cutoff) {
        this.cutoff = cutoff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}
