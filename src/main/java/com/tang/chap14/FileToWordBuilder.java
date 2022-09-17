package com.tang.chap14;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * @Classname FileToWordBuilder
 * @Description
 * @Date 2022/9/7 22:31
 * @Author by tangyao
 */
public class FileToWordBuilder {
    // 流生成器
    Stream.Builder<String> builder = Stream.builder();

    public FileToWordBuilder(String filePath) throws IOException {
        Files.lines(Paths.get(filePath))
                .skip(1)
                .forEach(line -> {
                    for (String w : line.split("[ .?,]+")) {
                        builder.add(w);
                    }
                });
    }

    Stream<String> stream() {
        return builder.build();
    }

    public static void main(String[] args) throws IOException {
        new FileToWordBuilder(RandomWords.path).stream()
                .limit(7)
                .map(w -> w + " ")
                .forEach(System.out::println);
    }

}
