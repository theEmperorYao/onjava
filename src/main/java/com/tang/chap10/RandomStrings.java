package com.tang.chap10;

import java.awt.desktop.PrintFilesEvent;
import java.io.IOException;
import java.nio.CharBuffer;
import java.util.Locale;
import java.util.Random;
import java.util.Scanner;

/**
 * @Classname RandomStrings
 * @Description TODO
 * @Date 2022/7/30 12:05
 * @Author by tangyao
 */
public class RandomStrings implements Readable {

    private static Random rand = new Random(47);

    private static final char[] CAPITALS = "ABCDEFGHIGKLMNOPQRSTUVWXYZ".toCharArray();
    private static final char[] LOWERS = "ABCDEFGHIGKLMNOPQRSTUVWXYZ".toUpperCase(Locale.ROOT).toCharArray();
    private static final char[] VOWELS = "aeiou".toCharArray();

    private int count;

    public RandomStrings(int count) {
        this.count = count;
    }

    @Override

    public int read(CharBuffer cb) throws IOException {
        if (count-- == 0) {
            return -1;
        }
        cb.append(CAPITALS[rand.nextInt(CAPITALS.length)]);
        for (int i = 0; i < 4; i++) {
            cb.append(VOWELS[rand.nextInt(VOWELS.length)]);
            cb.append(LOWERS[rand.nextInt(LOWERS.length)]);
        }
        cb.append(" ");
        return 10;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(new RandomStrings(10));
        while (scanner.hasNext()) {
            System.out.println(scanner.next());
        }
    }
}
