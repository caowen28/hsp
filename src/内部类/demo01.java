package 内部类;
/*
* 内部类：将类定义在其他类内部，这个类就是内部类
* 语法：
*       class outer{//外部类
*            class inner{
*           //内部类
*           }
*       }
*        class other{
*           //其他类
*           }
*   补充类的五大成员：属性，方法，构造器，代码块，内部类
*
* 内部类的种类：
*   1.定义在外部类的局部位置（如方法内）
*       局部内部类（有类名）
*       匿名内部类（无类名！！！！！！！！！）
*
*   2.定义在外部类的成员位置
*       成员内部类（无static）
*       静态内部类（有static）
* */
public class demo01{
    public static void main(String[] args) {

    }
}

class Outer{//外部类
    private int n1=100;
    public Outer(int n1){//构造器
        this.n1=n1;
    }
    public void m1(){
        System.out.println("m1()");
    }
    {//代码块
        System.out.println("outer的代码块");

    }


    class inner{//内部类




    }
}