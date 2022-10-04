package IO流.转换流;


import org.junit.Test;

import java.io.*;

//文件乱码案例
//出现乱码问题就是因为没有指定编码方式

//介绍:
//转换流:InputStreamReader和OutputStreamWriter
//InputStreamReader:Reader的子类，可以将InputStream(字节流)包装成Reader（字符流）
//OutputStreamWriter:writer子类，实现将OutputStreasm(字节流)包装成Writer(字符流)
//当处理纯文本是字符流效率高，可以解决中文编码问题
public class Transform_ {

    public static void main(String[] args) throws Exception{
       //输出流转换
        String filePath="d:\\hello.txt";
        OutputStreamWriter ou=new OutputStreamWriter(new FileOutputStream(filePath,true),"gbk");//改变的是整个文档的编码格式
        ou.write("hello world");
        ou.write("12345cgao");
        ou.close();
        System.out.println("数据备份完成");

    }
    @Test
    public void testt (){//会乱码文件
        //先读取一个文件
        //默认情况下读取文件按照utf-8读取
        //如果使用其他编码就会出现乱码
        String filePath="d:\\hello.txt";
        String s="";
        BufferedReader bufferedReader = null;
        try {
            bufferedReader = new BufferedReader(new FileReader(filePath));
             s=bufferedReader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {   System.out.println(s);
            try {
                bufferedReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }



    }
    @Test
    public void input() throws Exception{//输入流转换
        String filePath="d:\\hello.txt";
        //指定编码
        InputStreamReader isr = new InputStreamReader(new FileInputStream(filePath), "gbk");
        //把InputStreamReader传入BufferedReader
        BufferedReader bufferedReader=new BufferedReader(isr);
        // BufferedReader bufferedReader=new BufferedReader( new InputStreamReader(new FileInputStream(filePath), "gbk"));

        //读取
        String br=bufferedReader.readLine();
        System.out.println(br);
        bufferedReader.close();

    }
}
