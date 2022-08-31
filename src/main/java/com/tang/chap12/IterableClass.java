package com.tang.chap12;

import com.tang.pets.Pet;

import java.util.Iterator;

/**
 * @Classname IterableClass
 * @Description
 * @Date 2022/8/30 23:07
 * @Author by tangyao
 */

/**
 * for-in 使用这个Iterable接口来遍历序列， 创建了任何一个实现Iterable接口的类，都可以将其用于for-in语句
 */
public class IterableClass implements Iterable<String> {

    protected String[] words = ("And that is how " + "we know the Earth to be banana-shaped.").split(" ");

    @Override
    public Iterator<String> iterator() {
        return new Iterator<String>() {
            private int index = 0;

            @Override
            public boolean hasNext() {
                return index < words.length;
            }

            @Override
            public String next() {
                return words[index++];
            }

        };
    }

    public static void main(String[] args) {
        for (String s : new IterableClass()) {
            System.out.println(s + " ");
        }
    }
}
