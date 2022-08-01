//package com.tang.chap10;
//
//import com.tang.chap9.Note;
//
///**
// * @Classname Music4
// * @Description TODO
// * @Date 2022/7/29 23:21
// * @Author by tangyao
// */
//
//abstract class Instrument {
//    private int i;
//
//    public abstract void play(Note note);
//
//    public String what() {
//        return "Instrument";
//    }
//
//    public abstract void adjust();
//}
//
//class Wind extends Instrument {
//
//    @Override
//    public void play(Note note) {
//        System.out.println("Wind.play() " + note);
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("Adjusting Wind");
//    }
//}
//
//class Percussion extends Instrument {
//
//    @Override
//    public void play(Note note) {
//        System.out.println("Percussion.play() " + note);
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("Adjusting Percussion");
//    }
//}
//
//class Stringed extends Instrument {
//
//    @Override
//    public void play(Note note) {
//        System.out.println("Stringed.play() " + note);
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("Adjusting Stringed");
//    }
//}
//
//class Brass extends Wind {
//    @Override
//    public void play(Note note) {
//        System.out.println("Brass.play() " + note);
//    }
//
//    @Override
//    public void adjust() {
//        System.out.println("Adjusting Brass");
//    }
//}
//
//class Woodwind extends Wind {
//    @Override
//    public void play(Note note) {
//        System.out.println("Woodwind.play()" + note);
//    }
//
//    @Override
//    public String what() {
//        return "Woodwind";
//    }
//}
//
//
//public class Music4 {
//
//    static void tune(Instrument i) {
//        i.play(Note.MIDDLE_C);
//    }
//
//    static void tuneAll(Instrument[] e) {
//        for (Instrument instrument : e) {
//            tune(instrument);
//        }
//    }
//
//    public static void main(String[] args) {
//        Instrument[] orchestra = {
//                new Wind(),
//                new Percussion(),
//                new Stringed(),
//                new Brass(),
//                new Woodwind()
//        };
//
//        tuneAll(orchestra);
//    }
//}
