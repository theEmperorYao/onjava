package com.tang.chap11.extendInner;

/**
 * @Classname InheritInner
 * @Description
 * @Date 2022/8/20 20:25
 * @Author by tangyao
 */

class WithInner {
    class Inner {
        public void a(){}
    }
}

/**
 * 因为内部类的构造器必许附着到一个指向其包围类的对象的引用上。
 * InheritInner 只继承了内部类，而不是外围类，只传递一个执行器外围类对象的引用是不够的 还需在构造器内使用该语法
 * enclosingClassReference.super() 这样就提供了必需的引用，然后程序才能通过编译
 */
public class InheritInner extends WithInner.Inner {

//     InheritInner(){}//不能编译

    InheritInner(WithInner wi) {
        wi.super();
    }

    public static void main(String[] args) {
        WithInner withInner = new WithInner();
        InheritInner inheritInner = new InheritInner(withInner);

    }
}
