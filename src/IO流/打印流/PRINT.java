package IO流.打印流;

import org.junit.Test;

import java.io.FileWriter;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.nio.charset.StandardCharsets;

/*
* 打印流有两种
*   PrintStream和PrintWriter
*
*
* */
public class PRINT {

    public static void main(String[] args) {

    }
    @Test
    public void PrintStream_()throws Exception{
        PrintStream out=System.out;
        //默认情况下，PrintStream输出数据的位置是标准输出，即显示器
        out.println("hello world");
        //因为Print底层是write()，所以我们可以直接使用write打印
        out.write("hsp".getBytes(StandardCharsets.UTF_8));
        out.close();
        //我们可以修改打印流的位置
        //1，输出到e:\\hello.txt
        System.setOut(new PrintStream("d:\\hello.txt"));
        System.out.println("hahahahaha哈哈哈");

    }
    @Test
    public void printWriter()throws Exception{
        PrintWriter p=new PrintWriter(System.out,true);//标准输出，输出到控制台
        PrintWriter p2=new PrintWriter(new FileWriter("d:\\hello.txt",true));
        p.println("welcome to js");
        p2.println("lulululu");
        p.close();
        p2.close();
    }
}
