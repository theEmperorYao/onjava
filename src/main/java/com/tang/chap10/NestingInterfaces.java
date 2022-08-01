package com.tang.chap10;

/**
 * @Classname NestingInterfaces
 * @Description TODO
 * @Date 2022/7/30 14:33
 * @Author by tangyao
 */

class A {
    interface B {
        void f();
    }

    public class BImp implements B {

        @Override
        public void f() {

        }
    }

    public class BImp2 implements B {

        @Override
        public void f() {

        }
    }

    public interface C {
        void f();
    }

    private class CImp2 implements C {
        @Override
        public void f() {
        }
    }

    private interface D {
        void f();
    }

    private class DImp implements D {

        @Override
        public void f() {

        }
    }

    public class DImp2 implements D {

        @Override
        public void f() {

        }
    }

    public D getD() {
        return new DImp2();
    }

    private D dRef;

    public void receiveD(D d) {
        dRef = d;
    }


}

/**
 *
 */
interface E {
    interface G {
        void f();
    }

    interface H {
        void f();
    }

    void g();

    // 接口内不能用private
//        private interface I {

//        }

}

public class NestingInterfaces {
    public class BImp implements A.B {

        @Override
        public void f() {

        }
    }

    class CImp implements A.C {

        @Override
        public void f() {

        }
    }
    // private 接口 只能在定义的类里面实现
//    class DImp implements A.D{
//
//        @Override
//        public void f() {
//
//        }
//    }


    class EImp implements E {

        @Override
        public void g() {

        }
    }

    class EGImp implements E.G {
        @Override
        public void f() {

        }
    }

    class EImp2 implements E {

        @Override
        public void g() {

        }

        class EG implements E.G {

            @Override
            public void f() {

            }
        }
    }

    public static void main(String[] args) {
        A a = new A();
        // 无法访问A.D 因为A.D 是private，所以实现了D的A.DImp2 在使用的时候只能被视为 自身的类型
        // 你不能提及它实现了private的接口D。所以实现了private接口的话，可以再不添加任何类型信息的情况下，
        // 限定该接口中的方法定义（也就是说，不允许任何向上转型）。
//        A.D d = a.getD();
        // 只能返回 A.D
//        A.DImp2 di2 =a.getD();
        //无法访问该接口的方法
//        a.getD().f();
        A a2 = new A();
        // a.getD() 的返回值必须传递给一个有权使用它的对象——这里是另一个A，它可以通过receiveD()方法使用这个返回值。
        a2.receiveD(a.getD());
    }
}



