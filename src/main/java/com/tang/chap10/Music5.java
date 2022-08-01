package com.tang.chap10;

import com.tang.chap9.Note;

/**
 * @Classname Music4
 * @Description TODO
 * @Date 2022/7/29 23:21
 * @Author by tangyao
 */

interface Instrument {
    int VALUE = 5;

    default void play(Note note) {
        System.out.println(this + ".play() " + note);
    }

    default void adjust() {
        System.out.println("Adjusting " + this);
    }
}

class Wind implements Instrument {

    @Override
    public String toString() {
        return "Wind";
    }
}

class Percussion implements Instrument {
    @Override
    public String toString() {
        return "Percussion";
    }
}

class Stringed implements Instrument {

    @Override
    public String toString() {
        return "Stringed";
    }
}

class Brass extends Wind {
    @Override
    public String toString() {
        return "Brass";
    }
}

class Woodwind extends Wind {
    @Override
    public String toString() {
        return "Woodwind";
    }
}


public class Music5 {

    static void tune(Instrument i) {
        i.play(Note.MIDDLE_C);
    }

    static void tuneAll(Instrument[] e) {
        for (Instrument instrument : e) {
            tune(instrument);
        }
    }

    public static void main(String[] args) {
        Instrument[] orchestra = {
                new Wind(),
                new Percussion(),
                new Stringed(),
                new Brass(),
                new Woodwind()
        };

        tuneAll(orchestra);
    }
}
