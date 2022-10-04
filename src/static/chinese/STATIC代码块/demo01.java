package chinese.STATIC代码块;

/*
* 可以使用static关键字修饰代码块
*  1.语法格式：
*       static{
*       java语句；
*   }
*   2.静态代码块在类加载时执行且执行一次
*   3.静态代码块在一个类里可以有多个
*   4.静态代码块的作用是什么？怎么用？在那用？什么时候用？：
*         --这与具体需求有关，例如项目项目要求在类加载时完成日志的记录
*       那么这段日志的记录代码就可以写到静态代码块中，完成日志的记录
*         --静态代码块是java为程序员准备的特殊时刻（类加载）若希望在此刻进行一段特殊的程序，这段程序可以放到静态代码中
*
* */
public class demo01 {
    static {
        System.out.println("静态代码块1");
    }
    static {
        System.out.println("静态代码块2");
    }




    public static void main(String[] args) {
        System.out.println("main 方法");






    }

}
