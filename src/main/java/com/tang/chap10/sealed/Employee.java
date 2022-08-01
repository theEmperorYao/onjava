package com.tang.chap10.sealed;

/**
 * @Classname Employee
 * @Description TODO
 * @Date 2022/8/1 22:50
 * @Author by tangyao
 */
sealed interface Employee permits CLevel, Programmer {

}

// record 也可以用作接口的密封实现，因为record是隐式的final
record CLevel(String type) implements Employee {
}

record Programmer(String experience) implements Employee {
}



