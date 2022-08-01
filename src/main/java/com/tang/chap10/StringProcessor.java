package com.tang.chap10;

/**
 * @Classname StringProcessor
 * @Description TODO
 * @Date 2022/7/30 01:39
 * @Author by tangyao
 */
public interface StringProcessor extends Processor {

    // object协变为String
    @Override
    String process(Object input);

    String s = "If she weights the same as a duck , she's made of wood";

    static void main(String[] args) {
        Applicator.apply(new Upcase(),s);
        Applicator.apply(new Downcase(),s);
        Applicator.apply(new Splitter(),s);
    }


}
