package SUPER;

public class demo01 {
/*
* 1.super关键字全部小写
* 2.super和this对比
*   this:this出现在实例方法和构造方法中
*   this的语法：this. 和this()
*   this不能在静态方法中使用
*   this.大部分情况下可以省略
*   this()只能出现在构造方法第一行
*
*super
*   super出现在实例方法和构造方法中
*   super的语法：super. 和super()
*   super不能在静态方法中使用
*   super.大部分情况下可以省略
*   super()只能出现在构造方法第一行,通过当前方法调用父类构造方法(目的：创建子类对象时，初始化父类特征)
*
*
*
*
* */

    public static void main(String[] args) {
            new B();
    }
}

class A{
    int age=10;
//    public A() {
//        System.out.println("A的无参构造");
//    }

    public A(int age) {
        this.age = age;
        System.out.println(age);
    }
}
class B extends A{//如果去掉父类无参构造就会报错，
    public B() {
        //此处省略 super();
        super(200);
        System.out.println("B的无参构造");
    }
}