package com.tang.chap10;

import java.util.Arrays;
import java.util.Locale;

/**
 * @Classname Applicator
 * @Description TODO
 * @Date 2022/7/30 01:16
 * @Author by tangyao
 */


class Upcase implements Processor {
    @Override
    public Object process(Object input) {
        return ((String) input).toUpperCase(Locale.ROOT);
    }
}

class Downcase implements Processor {
    @Override
    public Object process(Object input) {
        return ((String) input).toLowerCase(Locale.ROOT);
    }
}

class Splitter implements Processor {
    @Override
    public String process(Object input) {
        return Arrays.toString(((String) input).split(" "));
    }
}


public class Applicator {

    public static void apply(Processor p, Object s) {
        System.out.println("Using processor " + p.name());
        System.out.println(p.process(s));
    }

    public static void main(String[] args) {
        String s = "we are such stuff as dreams are made on";

        apply(new Upcase(), s);
        apply(new Downcase(), s);
        apply(new Splitter(), s);
    }
}
