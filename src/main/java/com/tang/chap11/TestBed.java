package com.tang.chap11;

/**
 * @Classname TestBed
 * @Description
 * @Date 2022/8/8 23:39
 * @Author by tangyao
 */
public class TestBed {

    public void f(){
        System.out.println("f()");
    }

    public static class Tester {
        public static void main(String[] args) {
            TestBed testBed = new TestBed();
            testBed.f();
        }
    }
}
