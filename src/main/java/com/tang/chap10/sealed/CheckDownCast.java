package com.tang.chap10.sealed;

/**
 * @Classname CheckeDownCast
 * @Description TODO
 * @Date 2022/8/1 22:54
 * @Author by tangyao
 */

sealed interface II permits JJ {

}

final class JJ implements II {

}

class Something {
}


public class CheckDownCast {
    public void f() {

        II i = new JJ();
        JJ j = (JJ) i;
        // 编译器会阻止我们从密封类层次结构中向下转型为非法类型
//        Something s = (Something) i;


    }


}
