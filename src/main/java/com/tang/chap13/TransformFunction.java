package com.tang.chap13;

import java.util.function.Function;

/**
 * @Classname TransformFunction
 * @Description
 * @Date 2022/9/3 20:21
 * @Author by tangyao
 */

class I {
    @Override
    public String toString() {
        return "I";
    }
}

class O {
    @Override
    public String toString() {
        return "O";
    }
}

public class TransformFunction {
    static Function<I, O> transform(Function<I, O> in) {
        return in.andThen(o -> {
            System.out.println(o);
            return new O();
        });
    }

    // andThen 适用于 输入相同，输出不同的情况
    static Function<Mouse, Fish> m1(Function<Mouse, Cat> in) {
        return in.andThen(cat -> {
            System.out.println(cat);
            return new Fish();
        });
    }

    // compose 使用于 输入不同，输出相同的情况
    static Function<Mouse, Fish> m2(Function<Cat, Fish> in) {
        return in.compose(mouse -> {
            System.out.println(mouse);
            return new Cat();
        });
    }

    public static void main(String[] args) {
        Function<I, O> f2 = transform(i -> {
            System.out.println(i);
            return new O();
        });
        O apply = f2.apply(new I());

        // 高阶函数：函数作为入参或者函数作为返回值的函数
        Function<Mouse, Fish> mouseFishFunction = m1(mouse -> {
            System.out.println(mouse);
            return new Cat();
        });

        mouseFishFunction.apply(new Mouse());
    }
}

class Cat {
    @Override
    public String toString() {
        return "Cat";
    }
}

class Mouse {
    @Override
    public String toString() {
        return "mouse";
    }
}

class Fish {
    @Override
    public String toString() {
        return "fish";
    }
}


