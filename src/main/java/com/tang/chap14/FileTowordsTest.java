package com.tang.chap14;

/**
 * @Classname FileTowordsTest
 * @Description
 * @Date 2022/9/12 11:12
 * @Author by tangyao
 */
public class FileTowordsTest {
    public static void main(String[] args) throws Exception {
        FileToWords.stream(RandomWords.path)
                .limit(7)
                .forEach(s -> System.out.format("%s ", s));
        System.out.println();
        FileToWords.stream(RandomWords.path)
                .skip(7)
                .limit(2)
                .forEach(s -> System.out.format("%s ", s));
    }
}
