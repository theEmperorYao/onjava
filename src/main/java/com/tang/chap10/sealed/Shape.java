package com.tang.chap10.sealed;

/**
 * @Classname Shape
 * @Description TODO
 * @Date 2022/8/1 22:39
 * @Author by tangyao
 */
sealed class Shape {
}

final class Circle extends Shape {

}

final class Triangle extends Shape {

}

// sealed 允许有一组密封子类
sealed class Pet permits Dog, Cat {

}

// 不允许有进一步的子类
final class Dog extends Pet {

}

final class Cat extends Pet {

}

// 一个sealed类至少有一个子类
sealed class Bottom permits Level1 {

}

sealed class Level1 extends Bottom permits Level2 {

}

sealed class Level2 extends Level1 permits Level3 {

}

final class Level3 extends Level2 {

}

sealed class Super permits Sub1, Sub2 {
}

final class Sub1 extends Super {
}

// 一个sealed的基类无法阻止non-sealed 的子类的使用，因此可以随时开放限制
// Sub2 允许任意数量的子类，但是还是严格限制了sealed类Super的直接子类
non-sealed class Sub2 extends Super {
}

class Any1 extends Sub2 {

}

class Any2 extends Sub2 {

}

