package com.tang.chap11;

/**
 * @Classname ClassInterface
 * @Description
 * @Date 2022/8/8 23:34
 * @Author by tangyao
 */
public interface ClassInterface {

    void howdy();

    // 创建某个接口的所有不同实现的公用代码时，将一个类嵌入这个接口中会非常方便
    class Test implements ClassInterface {

        @Override
        public void howdy() {
            System.out.println("Howdy!");
        }
    }

    public static void main(String[] args) {
        new Test().howdy();
    }


}
