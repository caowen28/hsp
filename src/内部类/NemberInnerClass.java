package 内部类;
/*
* 成员内部类的使用
*   说明：成员内部类是定义在外部类的成员位置，没有static修饰
*       1.可以直接访问外部类的所有成员，包含私有
*       2.可以添加任意的访问修饰符，因为它的地位就是一个成员
*   作用域：和外部类其他成员一样，为整个类体
*   成员内部类访问外部类：直接访问
*   外部类访问成员内部类：创建对象访问
*
*
*
*
* */
public class NemberInnerClass {
    public static void main(String[] args) {
        //外部类访问成员内部类
        outer08 outer08 = new outer08();
        outer08.t1();
        //外部其他类访问内部类,三种方式
        //方法1
        内部类.outer08.Inner08 in=outer08.new Inner08();
        in.say();
        //方法2,在外部类中编写一个方法
        内部类.outer08.Inner08 innnn=outer08.getInner();
        innnn.say();
        //方法3,先创建外部类对象，通过外部类对象再创建内部类对象
        内部类.outer08.Inner08 i=new outer08().new Inner08();
        i.say();
        

    }
}
//外部类
class outer08{
    private int n1=10;
    public String name="张三";
    //内部类,同时也是一个成员（成员可以加的也可以加）
    class Inner08{
        public void say(){
            System.out.println("外部类的n1="+n1+";外部类的name="+name);
        }
    }
    //写方法
    public void t1(){//成员内部类
        Inner08 in=new Inner08();
        in.say();
    }
    public  Inner08 getInner(){

        return new Inner08();
    }
}