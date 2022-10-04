package IO流.Reader和writer;

import org.junit.Test;

import java.io.IOException;
import java.io.FileReader;

public class FileReader_ {
//          文件输入流
    // FileReader相关方法
    //read()                         每次读取一个字符，返回下一个字符(int类型)
    //read(char[])                   每次读取多个字符，返回实际读到的字符数
    //new String(char[])             将char转换成String
    //new String(char[] ,off,len)    将char数组指定部分转换成String
    public static void main(String[] args) {
        String filePath="c:\\hello.txt";
        FileReader fileReader=null;
        int data=0;
        //1.创建fileReader对象
        try {
            fileReader=new FileReader(filePath);
            //读取文件
            //1.read()读取单个字符，效率低，读取完毕返回-1
            while ((data=fileReader.read())!=-1){
                System.out.print((char)data);
            }


        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 方式一
            // if(fileReader!=null){
            // fileReader.close();
            // }
            // 因为关闭的是fileReader这个对象，
            // 所以fileReader!=null
            try {//方式二
                fileReader.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
    @Test
    public void readFile(){
        String filePath="c:\\hello.txt";
        FileReader fileReader=null;
        int data=0;
        char[] chars=new char[8];
        //1.创建fileReader对象
        try {
            fileReader=new FileReader(filePath);
            //读取文件
            //1.read(char[] chars)读取多个字符，效率高，读取完毕返回-1
            //返回值是实际读取到的字符数
            while ((data=fileReader.read(chars))!=-1){
                System.out.print(new String(chars,0,data));
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            // 方式一
             if(fileReader!=null){
                 try {
                     fileReader.close();
                 } catch (IOException e) {
                     e.printStackTrace();
                 }
             }
            // 因为关闭的是fileReader这个对象，
            // 所以fileReader!=null

        }
    }

}
