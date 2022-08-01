package com.tang.chap10;

import java.nio.CharBuffer;
import java.util.Scanner;

/**
 * @Classname AdaptedRandomDoubles
 * @Description TODO
 * @Date 2022/7/30 13:05
 * @Author by tangyao
 */
public class AdaptedRandomDoubles implements RandomDoubles, Readable {

    private int count;

    public AdaptedRandomDoubles(int count) {
        this.count = count;
    }

    @Override
    public int read(CharBuffer cb) {
        if (count-- == 0) {
            return -1;
        }
        String result = next() + " ";
        cb.append(result);
        return result.length();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(new AdaptedRandomDoubles(7));
        while (s.hasNextDouble()) {
            System.out.println(s.nextDouble() + " ");
        }
    }

}
