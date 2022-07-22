package com.tang.chap9;

/**
 * @Classname Music
 * @Description TODO
 * @Date 2022/7/22 23:19
 * @Author by tangyao
 */
public class Music {
    public static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    public static void main(String[] args) {
        Wind flute = new Wind();
        Brass brass = new Brass();
        Stringed stringed = new Stringed();
        tune(brass);
        tune(stringed);
        tune(flute);
    }
}
