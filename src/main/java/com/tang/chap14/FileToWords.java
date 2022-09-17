package com.tang.chap14;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.regex.Pattern;
import java.util.stream.Stream;

/**
 * @Classname FileToWords
 * @Description
 * @Date 2022/9/7 23:05
 * @Author by tangyao
 */
public class FileToWords {

    public static Stream<String> stream(String filePath) throws Exception {
        return Files.lines(Paths.get(filePath))
                .skip(1) // First (comment) line
                .flatMap(line ->
                        Pattern.compile("\\W+").splitAsStream(line));
    }


}
