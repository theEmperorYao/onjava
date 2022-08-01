package com.tang.chap10.sealed;

/**
 * @Classname Base
 * @Description TODO
 * @Date 2022/8/1 22:33
 * @Author by tangyao
 */

final class D1 extends Base {
}

final class D2 extends Base {

}
//final class D3 extends Base {
//
//}

sealed public class Base permits D1, D2 {

}
