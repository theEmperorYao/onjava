package com.tang.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Classname FilesToWord
 * @Description
 * @Date 2022/9/12 09:34
 * @Author by tangyao
 */
public class FilesToWords {
    // \\W 意味着是一个"非单词字符" + 意味着"一个或者多个"。小写形式\\w 指的是 '单词字符'
    public static Stream<String> stream(String filePath) throws IOException {
//        Stream<String> stream = Files.lines(Paths.get(filePath)).skip(1).flatMap(line -> Arrays.stream(line.split("\\W+")));

        return Files.lines(Paths.get(filePath)).skip(1)
                .flatMap(line -> Pattern.compile("\\W+").splitAsStream(line));


    }
}
