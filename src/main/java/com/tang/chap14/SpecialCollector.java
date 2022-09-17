package com.tang.chap14;

import java.util.ArrayList;
import java.util.List;

/**
 * @Classname SpecailCollector
 * @Description
 * @Date 2022/9/17 09:15
 * @Author by tangyao
 */
public class SpecialCollector {

    public static void main(String[] args) throws Exception {
        List<String> words = FileToWords.stream(RandomWords.path)
                .collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);

        System.out.println("words = " + words);
        words.stream()
                .filter(s -> s.equals("cheese"))
                .forEach(System.out::println);

    }
}
