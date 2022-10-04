package 内部类;

/*
*   匿名内部类(本质是类，同时也是一个对象)
*       说明：定义在外部类的局部（如方法类，无类名修饰）
*   基本语法
*       new 类或接口(参数列表){
*           类体
*           };
*
*
* jdk的底层会创建匿名内部类Outer04，立刻创建实例把地址返回给对象的引用
* 匿名内部类只能使用一次，但对象可以反复使用
* 其他外部类不能访问匿名内部类
* 如果外部类和局部内部类重名时遵循就近原则，如果想访问外部类的成员可通过（外部类名.this.成员）去访问
* */

public class AnonymousInnerClass {

    public static void main(String[] args) {
    Outer04 ou=new Outer04();
    ou.method();
    }
}

class Outer04{//外部类
    private int n1=10;
    public void method(){
        //基于接口的匿名内部类
        new A(){
            @Override
            public void cry() {
                System.out.println("实现了接口A的cry方法");
            }
        }.cry();

        //基于类的匿名内部类
        //方法1
        new Father(){
            @Override
            public void test() {
                System.out.println("实现了Father的test方法");
            }
        }.test();
//       方法2
//        Father f=new Father() {
//            @Override
//            public void test() {
//                System.out.println("实现了Father的test方法");
//            }
//        };
//        f.test();//动态绑定

    }


}
interface A{//接口
    public void cry();

}

class Father{
    public Father() {
    }
    public void test(){

    }
}