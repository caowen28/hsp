package IO流.OutputStream;
import org.junit.Test;

import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

/*
* 从程序向磁盘等存储设备输出文件，如果没有这个文件则自动创建
*  new FileOutputStream(filePath);如果这使用这个方式添加数据，文件原本有数据就会被添加的数据覆盖
* new FileOutputStream(filePath,true);使用这种方式的添加数据会被放到后边，源文件不会被覆盖
* */
public class FileOutputStream_ {


    public static void main(String[] args) {

    }
    //演示FileoutputStream
    @Test
    public void writeFile(){
        String filePath="D:\\helo.txt";
        FileOutputStream fileOutputStream=null;
        try {
            //创建字节输出流对象
            fileOutputStream= new FileOutputStream(filePath);
            //写入一个字节
            fileOutputStream.write('H');
            //写多个字符
            String str="hsp.java";
           // str.getBytes()   可以将字符串转化成一个字节数组
            fileOutputStream.write(str.getBytes(StandardCharsets.UTF_8));
             //   fileOutputStream.write(byte[] b,int off, int len);获取byte[]中从下标为off开始到len长度的字符串
            fileOutputStream.write(str.getBytes(),0,str.length());

        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

}
