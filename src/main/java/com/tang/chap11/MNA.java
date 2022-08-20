package com.tang.chap11;

/**
 * @Classname MNA
 * @Description
 * @Date 2022/8/8 23:40
 * @Author by tangyao
 */
public class MNA {
    private void f() {
    }

    class A {
        private void g() {

        }

        public class B {
            void h() {
                g();
                f();
            }
        }

        public MNA mna() {
            return MNA.this;
        }

    }

    public class MultiNestingAccess {
        public static void main(String[] args) {
            MNA mna = new MNA();
            A a = mna.new A();
            A.B b = a.new B();
            b.h();

        }
    }
}
