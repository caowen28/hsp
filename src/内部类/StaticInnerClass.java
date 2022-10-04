package 内部类;
/*
*说明:静态内部类是定义在外部类的成员位置，且有static修饰
* 1.可以直接访问外部的静态成员，包含私有，但不能直接访问非静态成员
* 2.可以添加访问修饰符，因为它的地位就是一成员
*
* 如果外部类和静态内部类的成员重名时，采取就近原则，如果先访问外部类的成员（外部类名.成员）
*
* */
public class StaticInnerClass {
    public static void main(String[] args) {
            outer10 outer10=new outer10();
            outer10.m1();

            //外部其他类访问静态内部类
        //方法1
        内部类.outer10.Inner inner10=new outer10.Inner();
        inner10.say();
        //方法2
        内部类.outer10.Inner inner100=outer10.getInner();
        inner100.say();

    }
}
//外部类
class outer10{
    private int n1=10;
    private static String name="张三";
    private static void cry(){
        System.out.println("cry()");
    }
    //静态内部类
     static class Inner{
        public void say(){
            System.out.println("name="+name);
            cry();
        }

    }
    public void m1(){
        Inner inner = new Inner();
        inner.say();
    }
    public Inner getInner(){
        return new Inner();
    }
}