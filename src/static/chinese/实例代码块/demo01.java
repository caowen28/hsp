package chinese.实例代码块;

public class demo01 {
    /*
    * 实例代码块：了解即可，不常用
    *   语法：{
    *       Java代码;
    *           }
    *   格式：
    *       实例代码块在构造方法执行前执行，构造方法执行一次实例代码块执行一次
    *
    * */

    public demo01() {
        System.out.println("构造方法");
    }

    {//实例代码块
        System.out.println(1);
    }
    {
        System.out.println(2);
    }
    {
        System.out.println(3);
    }


    public static void main(String[] args) {
        System.out.println("main方法");
        new demo01();
    }
}
