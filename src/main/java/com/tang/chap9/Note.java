package com.tang.chap9;

/**
 * @Classname Note
 * @Description TODO
 * @Date 2022/7/22 23:16
 * @Author by tangyao
 */
public enum Note {
    MIDDLE_C, C_SHARP, B_FLAT;
}

class Instrument {
    public void play(Note note) {
        System.out.println("Instrument.play()");
    }

    String what() {
        return "Instrument";
    }

    void adjust(){
        System.out.println("Adjusting Instrument");
    }
}


