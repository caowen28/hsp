package 内部类;

/*
* 局部内部类
*
* 局部内部类可以直接访问外部类的所有元素
* 外部类在方法中创建内部类对象实例来调用内部类的元素
* 外部其他类不能访问局部内部类
* 如果外部类和局部内部类重名时遵循就近原则，如果想访问外部类的成员可通过（外部类名.this.成员）去访问
* */
public class JuBuInnerClass {
    public static void main(String[] args) {
        Outer2 out=new Outer2();
        out.n1();
    }

}
class Outer2{//外部类
    private int n1=100;
    public void m2(){
        System.out.println("外部类的m2()");
    }
    public void n1(){
        //局部内部类定义在外部类的局部，通常在方法中
        //不能添加访问修饰符，但可以使用final
        //内部类的作用域：仅在定义它的方法或代码块中
        class Inner2{//局部内部类（本质还是一个类）
            //可以访问外部类的所有成员包括私有
            private int n1=700;
            public void n1(){
                System.out.println("n1="+n1+";外部类的n1="+Outer2.this.n1);
            m2();
            }

        }
        //外部类访问内部类
            Inner2 in=new Inner2();
            in.n1();
    }
}
