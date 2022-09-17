package com.tang.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Random;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * @Classname RandomWords
 * @Description
 * @Date 2022/9/6 08:18
 * @Author by tangyao
 */
public class RandomWords implements Supplier<String> {

    List<String> words = new ArrayList<>();

    Random rand = new Random(47);

    RandomWords(String fname) throws IOException {
        List<String> lines = Files.readAllLines(Paths.get(fname));
        // 跳过第一行
        for (String line : lines.subList(1, lines.size())) {
            // + 代表前面的事物可以出现一次或多次
            for (String word : line.split("[ .?,]+")) {
                words.add(word.toLowerCase());
            }
        }

    }

    @Override
    public String get() {
        return words.get(rand.nextInt(words.size()));
    }

    @Override
    public String toString() {
        return String.join(" ", words);
    }

    public static String path = "/Users/tangyao/Code/java/onjava/src/main/resources/Cheese.dat";

    public static void main(String[] args) throws IOException {

        System.out.println(Stream.generate(new RandomWords(path)).limit(10).collect(Collectors.joining(" ")));
    }
}
