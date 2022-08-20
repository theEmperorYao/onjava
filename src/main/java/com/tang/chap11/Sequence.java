package com.tang.chap11;

/**
 * @Classname Seuence
 * @Description TODO
 * @Date 2022/8/1 23:29
 * @Author by tangyao
 */
public class Sequence {
    private Object[] items;
    private int next = 0;

    public Sequence(int size) {
        items = new Object[size];
    }

    public void add(Object x) {
        if (next < items.length) {
            items[next++] = x;
        }
    }

    /**
     * 内部类拥有外围对象的所有元素的访问权
     * 对于负责创建内部类的特定外部类而言（内部类非static），内部类对象偷偷地获取了一个指向它的引用，
     * 然后，当你要访问外部类的成员时，该引用会被用于选择相应的成员
     */

    private class SequenceSelector implements Selector {

        private int i = 0;

        @Override
        public boolean end() {
            return i == items.length;
        }

        @Override
        public Object current() {
            return items[i];
        }

        @Override
        public void next() {
            if (i < items.length) {
                i++;
            }
        }
    }

    public Selector selector() {
        return new SequenceSelector();
    }

    // 如果Sequence.java 没有使用内部类，那么一个Sequence是一个Selector
    // 而且对于某个特定的Sequence,你只能使用一种Selector,
    // 可以使用另一种方法，即reverseSelector,得到一个在序列中从后往前的Selector，这种灵活性只有在内部类中才有
    public Selector reverseSelector() {

        return new Selector() {
            @Override
            public boolean end() {
                return false;
            }

            @Override
            public Object current() {
                return null;
            }

            @Override
            public void next() {

            }
        };
    }

    public static void main(String[] args) {
        Sequence sequence = new Sequence(10);
        for (int i = 0; i < 10; i++) {
            sequence.add(i + "");
        }
        // 迭代器设计模式
        Selector selector = sequence.selector();
        while (!selector.end()) {
            System.out.println(selector.current() + " ");
            selector.next();
        }
    }

}
