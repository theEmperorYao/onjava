package com.tang.chap10.filters;

/**
 * @Classname BandPass
 * @Description TODO
 * @Date 2022/7/30 01:35
 * @Author by tangyao
 */
public class BandPass extends Filter {
    double lowCutoff, highCutoff;

    public BandPass(double lowCutoff, double highCutoff) {
        this.lowCutoff = lowCutoff;
        this.highCutoff = highCutoff;
    }

    @Override
    public WaveForm process(WaveForm input) {
        return input;
    }
}
