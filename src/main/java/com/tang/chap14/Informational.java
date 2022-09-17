package com.tang.chap14;

/**
 * @Classname Informational
 * @Description
 * @Date 2022/9/17 10:02
 * @Author by tangyao
 */
public class Informational {

    public static void main(String[] args) throws Exception {
        System.out.println(FileToWords.stream(RandomWords.path).count());
        System.out.println(FileToWords.stream(RandomWords.path)
                .min(String.CASE_INSENSITIVE_ORDER)
                .orElse("NONE"));
        System.out.println(FileToWords.stream(RandomWords.path).max(String.CASE_INSENSITIVE_ORDER).orElse("NONE"));

    }
}
