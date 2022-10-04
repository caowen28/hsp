package 异常;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
/*
* 编译异常必须要处理，运行异常程序员可以不用处理因为jvm会默认处理
*
* public String getMessage():返回异常的原因
* public String toString():抛出简单描述
* public void printStackTrace():将异常的错误信息输出到控制台
*
*
* 虽然通过try catch可以对异常进行处理，但并不是所有情况我们都有权访问
* 这时候就可以使用throws解决
*
* 使用try catch程序可以一直往下处理
* throws只是将异常抛出给调用者处理，自身并不会处理
*
* */
public class throws_01 {
    public static void main(String[] args) {
        try {
            f1();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        System.out.println("end");//使用try catch程序会全部执行;使用 throws程序异常会终止该程序
    }
    public static void f1() throws FileNotFoundException{//f1()调用f2()时，因为f2会产生异常而f2方法又被f1方法调用所以f1方法也要声明异常
    f2();
    }
    public static void f2() throws FileNotFoundException {//f2可能会抛出异常
        FileInputStream f=new FileInputStream("c://aa.txt");
    }
}
