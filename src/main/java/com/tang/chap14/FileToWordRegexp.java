package com.tang.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.util.regex.Pattern.*;

/**
 * @Classname FiletoWordRegexp
 * @Description
 * @Date 2022/9/7 22:49
 * @Author by tangyao
 */
public class FileToWordRegexp {
    private String all;

    public FileToWordRegexp(String filePath) throws IOException {
        all = Files.lines(Paths.get(filePath))
                .skip(1)
                .collect(Collectors.joining(" "));
    }

    public Stream<String> stream() {
        return compile("[ .,?]+").splitAsStream(all);
    }

    public static void main(String[] args) throws IOException {
        FileToWordRegexp fw = new FileToWordRegexp(RandomWords.path);
        fw.stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::println);

        fw.stream()
                .skip(7)
                .map(w -> w + " ")
                .forEach(System.out::println);

        String a = "1 2 3 4 5";
        String collect = compile(" ").splitAsStream(a).collect(Collectors.joining("_"));

        System.out.println("collect = " + collect);
    }

}
