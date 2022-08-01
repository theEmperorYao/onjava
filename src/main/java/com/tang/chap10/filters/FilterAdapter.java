package com.tang.chap10.filters;


import com.tang.chap10.Processor;

/**
 * @Classname FilterAdapter
 * @Description TODO
 * @Date 2022/7/30 01:46
 * @Author by tangyao
 */
public class FilterAdapter implements Processor {

    Filter filter;

    FilterAdapter(Filter filter) {
        this.filter = filter;
    }

    @Override
    public String name() {
        return filter.name();
    }

    @Override
    public WaveForm process(Object input) {
        return filter.process((WaveForm) input);
    }
}
