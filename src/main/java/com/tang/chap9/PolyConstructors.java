package com.tang.chap9;

/**
 * @Classname PolyConstructors
 * @Description TODO
 * @Date 2022/7/25 23:51
 * @Author by tangyao
 */

class Glyph {
    void draw() {
        System.out.println("Glyph draw()");
    }

    /**
     *  因此编写构造器有一个很好的准则，用尽可能少的操作使对象进入正常状态，可以避免的话，不要调用此类的任何方法，
     *  只有基类的final方法可以在构造器中安全调用（也适用于private方法，他们默认是final的）
     */
    Glyph() {
        System.out.println("Glyph() before draw()");
        // 2、被重写的draw 会被调用，但此时radius为0
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    /**
     * 1、在未发生任何事之前，为对象分配的存储空间会先被初始化为0，或者对于其他数据类型，任何与0等价的值（null）
     * 包括通过组合嵌入在类中的对象 radius=0
     * 3、按照声明的顺序来初始化成员 radius=1
     */
    private int radius = 1;

    RoundGlyph(int r) {
        //4、子类构造器主体被执行
        radius = r;
        System.out.println("RoundGlyph() , radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius= " + radius);
    }
}


public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
