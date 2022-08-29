package com.tang.chap12;

import com.tang.chap7.D;

import java.util.*;

/**
 * @Classname ListIteration
 * @Description
 * @Date 2022/8/21 12:40
 * @Author by tangyao
 */
public class ListIteration {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(4, 2, 3));

        ListIterator<Integer> iterator = list.listIterator();
        System.out.println(iterator.nextIndex());
        while (iterator.hasNext()) {
            System.out.println(iterator.next() + " " + iterator.nextIndex() + " " + iterator.previousIndex());
        }

        while (iterator.hasPrevious()) {
            System.out.println("iterator.previous() = " + iterator.previous());
        }
        while (iterator.hasNext()) {
            iterator.next();
            iterator.set(999);
        }
        System.out.println(list);

    }
}
