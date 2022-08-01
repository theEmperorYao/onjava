## on java 8 笔记 --查缺补漏

#### Chap 1~8

1、基本类型是存储在栈中的，堆中存储对象和数组

2、类变量初始化的时候，是在构造方法之前

3、静态代码块只有当 第一次创建该类对象或 第一次访问该类的数据成员时，会被执行

4、父类与子类静态代码块，代码块，和构造方法的执行顺序

```java
父类静态代码块
子类静态代码块
父类代码块
父类构造方法
子类代码块
子类构造方法
```

5、想访问一个类的方法或者成员变量，但是不是一个包下，且不希望所有人都可以访问，仅能继承之后才可以访问，此时用protected
6、组合与继承，一个标准是问一下自己需要从新类向上转型到基类。

7、final 赋值操作要么在字段定义时使用表达式赋值，要么在构造器中，保证final字段在使用之前总被初始化。
8、final修饰方法参数，主要用于将数据传递给匿名内部类。



#### Chap 9 多态

9、方法声明为final，可以防止别人重写，更重要的是关闭了动态绑定。

10、只有普通方法调用是多态的，如果直接访问一个字段，则会在编译时解析。想调用super的字段，显示的调用super.field。

```java
class Super {
    public int field = 0;

    public int getField() {
        return field;
    }
}

class Sub extends Super {
    public int field = 1;

    @Override
    public int getField() {
        return field;
    }

    public int getSuperField() {
        return super.field;
    }
}

public class FieldAccess {
    public static void main(String[] args) {
        Super sup = new Sub();
        System.out.println("sup.field =" + sup.field + ", sup.getField()=" + sup.getField());
        Sub sub = new Sub();
        System.out.println("sub.field =" + sub.field + ", sub.getField()=" + sub.getField() + ", sup.getSuperField()=" + sub.getSuperField());

    }
}

// output:
//sup.field =0, sup.getField()=1
//sub.field =1, sub.getField()=1, sup.getSuperField()=0
```

11、方法是静态的，那么行为就不是多态的

```java
class StaticSuper {
    public static String staticGet() {
        return "Base staticGet";
    }

    public String dynamicGet() {
        return "Base dynamicGet()";
    }

}

class StaticSub extends StaticSuper {
    public static String staticGet() {
        return "Derived staticGet";
    }

    @Override
    public String dynamicGet() {
        return "Derived dynamicGet()";
    }

}


public class StaticPolymorphism {
    public static void main(String[] args) {

        StaticSuper sup = new StaticSub();
        System.out.println(StaticSuper.staticGet());
        System.out.println(sup.dynamicGet());
    }
}
//output:
//Base staticGet
//Derived dynamicGet()

```



12、基类的字段通常是private，因此一般必须假设子类只能访问自己的成员，而不能访问基类的成员，因此必须调用所有构造器；否则将无法构造整个对象。

13、构造器内部的多态方法行为

```java
class Glyph {
    void draw() {
        System.out.println("Glyph draw()");
    }

    /**
     *  因此编写构造器有一个很好的准则，用尽可能少的操作使对象进入正常状态，可以避免的话，不要调用此类的任何方法，
     *  只有基类的final方法可以在构造器中安全调用（也适用于private方法，他们默认是final的）
     */
    Glyph() {
        System.out.println("Glyph() before draw()");
        // 2、被重写的draw 会被调用，但此时radius为0
        draw();
        System.out.println("Glyph() after draw()");
    }
}

class RoundGlyph extends Glyph {
    /**
     * 1、在未发生任何事之前，为对象分配的存储空间会先被初始化为0，或者对于其他数据类型，任何与0等价的值（null）
     * 包括通过组合嵌入在类中的对象 radius=0
     * 3、按照声明的顺序来初始化成员 radius=1
     */
    private int radius = 1;

    RoundGlyph(int r) {
        //4、子类构造器主体被执行
        radius = r;
        System.out.println("RoundGlyph() , radius = " + radius);
    }

    @Override
    void draw() {
        System.out.println("RoundGlyph.draw(), radius= " + radius);
    }
}


public class PolyConstructors {
    public static void main(String[] args) {
        new RoundGlyph(5);
    }
}
/**
output:
Glyph() before draw()
RoundGlyph.draw(), radius= 0
Glyph() after draw()
RoundGlyph() , radius = 5
*/
```

14、协变返回类型，子类可以重写基类的方法的返回值，可以是基类方法返回值的子类型。

#### Chap10 接口

1、静态方法只能被接口调用，默认方法可以被实现类调用
2、sealed 的作用：
	2.1、指定可以被哪些类继承，虽然子类可以是non-sealed ，下一个子类可以多继承没有限制，但是保证了 基类可以被哪些第一层的·子类继承。
	2.2、接口，抽象类也可以被sealed修饰。

​	2.3、record隐式是final类型的，也可以当做 sealed基类的子类。
​	2.4、可以在运行时使用getPermittedSubclasses()方法来发现允许的子类。
​	2.5、所有子类都在同一个文件里，就不需要permits。

#### Chap11  内部类

1、可以链接到外部类

2、.this 和.new 用法

```java
public class DotThis {

    void f() {
        System.out.println("DotTHis.f()");
    }

    public class Inner {
        public DotThis outer() {
            // 生成外部类对象的引用的写法，该引用会自动拥有正确的类型，而且是编译时确定并检查的，所以没有任何运行时开销。
            return DotThis.this;
        }
    }

    public Inner inner() {
        return new Inner();
    }

    public static void main(String[] args) {
        DotThis dotThis = new DotThis();
        Inner inner = dotThis.inner();
        inner.outer().f();
    }
}
```



```java
public class Parcel3 {
    class Contents {
        private int i = 11;

        public int value() {
            return i;
        }
    }

    class Destination {
        private String label;

        Destination(String whereTo) {
            label = whereTo;
        }

        String readLabel() {
            return label;
        }
    }

    public static void main(String[] args) {
        Parcel3 parcel3 = new Parcel3();
        //必须使用外部类的实例，来创建内部类的实例
        Contents contents = parcel3.new Contents();
        Destination tasmania = parcel3.new Destination("Tasmania");
        // 除非已经有了一个外部类对象，否则创建内部类对象是不可能的，这是因为内部类的对象会暗中连接到用于创建它的外部类对象。
        // 然而，如果你创建的是嵌套类（static修饰的内部类，他就不需要指向外部类对象的引用）
    }
}

```

