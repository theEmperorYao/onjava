package com.tang.chap12;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/**
 * @Classname ReversibleArrayList
 * @Description
 * @Date 2022/8/31 08:21
 * @Author by tangyao
 */
public class ReversibleArrayList<T> extends ArrayList<T> {

    ReversibleArrayList(Collection<T> c) {
        super(c);
    }

    // 适配器方法，当已经有一个接口，而我们需要另一个，
    public Iterable<T> reversed() {

        return new Iterable<T>() {
            @Override
            public Iterator<T> iterator() {

                return new Iterator<T>() {
                    int current = size() - 1;

                    @Override
                    public boolean hasNext() {
                        return current > -1;
                    }

                    @Override
                    public T next() {
                        return get(current--);
                    }
                };
            }
        };
    }
}

class AdapterMethodIdiom {
    public static void main(String[] args) {
        ReversibleArrayList<String> ral = new ReversibleArrayList<>(Arrays.asList("To be or not to be".split(" ")));
        for (String s : ral) {
            System.out.print(s + " ");
        }
        System.out.println();
        for (String s : ral.reversed()) {
            System.out.println(s + " ");
        }

    }
}
