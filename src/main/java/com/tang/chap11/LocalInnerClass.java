package com.tang.chap11;

/**
 * @Classname GetCounter2
 * @Description
 * @Date 2022/8/21 00:59
 * @Author by tangyao
 */

interface Counter {
    int next();
}

public class LocalInnerClass {
    private int count = 0;

    Counter getCounter(final String name) {
        class LocalCounter implements Counter {

            LocalCounter() {
                System.out.println("LocalCounter()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        }
        return new LocalCounter();
    }

    Counter getCounter2(final String name) {
        return new Counter() {

            // 匿名内部类不能有具名的构造器，只有一个实例初始化部分
            {
                System.out.println("Counter()");
            }

            @Override
            public int next() {
                System.out.println(name);
                return count++;
            }
        };

    }

    public static void main(String[] args) {
        LocalInnerClass localInnerClass = new LocalInnerClass();
        Counter c1 = localInnerClass.getCounter("Local inner ");
        Counter c2 = localInnerClass.getCounter2("Anonymous inner ");

        for (int i = 0; i < 5; i++) {
            System.out.println(c1.next());
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(c2.next());
        }

    }

}