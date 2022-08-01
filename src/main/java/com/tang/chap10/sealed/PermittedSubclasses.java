package com.tang.chap10.sealed;

/**
 * @Classname PermittedSubClass
 * @Description TODO
 * @Date 2022/8/1 22:57
 * @Author by tangyao
 */

sealed class Color permits Red, Green, Blue {
}

final class Red extends Color {
}

final class Green extends Color {
}

final class Blue extends Color {
}

public class PermittedSubclasses {

    public static void main(String[] args) {
        //可以在运行时使用getPermittedSubclasses()方法来发现允许的子类
        for (Class<?> p : Color.class.getPermittedSubclasses()) {
            System.out.println(p.getSimpleName());
        }
    }

}
