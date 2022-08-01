package com.tang.chap10.filters;

import com.tang.chap10.Applicator;

/**
 * @Classname FilterProcessor
 * @Description TODO
 * @Date 2022/7/30 01:50
 * @Author by tangyao
 */
public class FilterProcessor {

    public static void main(String[] args) {
        WaveForm w = new WaveForm();
        Applicator.apply(new FilterAdapter(new LowPass(1.0)), w);
        Applicator.apply(new FilterAdapter(new HighPass(2.0)), w);
        Applicator.apply(new FilterAdapter(new BandPass(3.0,4.0)), w);
    }
}
