package com.tang.chap14;

import java.util.Optional;
import java.util.Random;
import java.util.stream.Stream;

/**
 * @Classname Singal
 * @Description
 * @Date 2022/9/14 23:19
 * @Author by tangyao
 */
public class Singal {
    private final String msg;

    public Singal(String msg) {
        this.msg = msg;
    }

    public String getMsg() {
        return msg;
    }

    @Override
    public String toString() {
        return "Singal{" +
                "msg='" + msg + '\'' +
                '}';
    }

    static Random random = new Random(47);

    public static Singal morse() {
        switch (random.nextInt(4)) {
            case 1:
                return new Singal("dot");
            case 2:
                return new Singal("dash");
            default:
                return null;
        }
    }

    public static Stream<Optional<Singal>> stream() {
        return Stream.generate(Singal::morse)
                .map(singal -> Optional.ofNullable(singal));
    }



}
