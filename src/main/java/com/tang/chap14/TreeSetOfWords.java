package com.tang.chap14;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Set;
import java.util.TreeSet;
import java.util.stream.Collectors;

/**
 * @Classname TreeSetOfWords
 * @Description
 * @Date 2022/9/17 08:24
 * @Author by tangyao
 */
public class TreeSetOfWords {
    public static void main(String[] args) throws IOException {
        String path = "/Users/tangyao/Code/java/onjava/src/main/java/com/tang/chap14/TreeSetOfWords.java";
        Set<String> words = Files.lines(Paths.get(path))
                .flatMap(s -> Arrays.stream(s.split("\\W+")))
                .filter(s -> !s.matches("\\d+"))
//                .map(String::trim)
                .filter(s -> s.length() > 2)
                .limit(100)
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("words = " + words);

        TreeSet<String> treeSet = Files.lines(Paths.get(path))
                .flatMap(s -> Arrays.stream(s.split("\\W+")))
                .filter(s -> !s.matches("\\d+"))
                .filter(s -> !s.equals(s.trim()))
                .collect(Collectors.toCollection(TreeSet::new));
        System.out.println("treeSet = " + treeSet);


    }
}
