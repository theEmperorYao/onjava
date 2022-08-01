package com.tang.chap10.sealed;

/**
 * @Classname Ifc
 * @Description TODO
 * @Date 2022/8/1 22:35
 * @Author by tangyao
 */


final class Imp1 implements Ifc {

}

final class Imp2 implements Ifc {

}

sealed interface Ifc permits Imp1, Imp2 {

}

final class X extends AC {

}

sealed abstract class AC permits X {

}
