package IO流.Reader和writer;

import org.junit.Test;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriter_ {
/*
* 常用方法：
*   new FileWriter(File/String)         覆盖模式，相当于流的指针在首端
*   new FileWriter(File/String，true)   追加模式，相当于在文本末jix尾添加
 *  write(int)      写入单个字符
 *  write(char[])   写入指定数组
 *  write(char[],off,len) 写入数组指定位置的内容
 *  write(String) 写入整个字符串
 *  write(String,of,len) 写入字符串指定位置内容
 *
 * 注意：
 *  FileWriter使用后，一定要关闭(close)或者刷新(flush)否则写入不到指定文件
* */
    public static void main(String[] args) {

    }
    @Test
    public void writerFile(){
        String filePath="c:\\hell0.txt";
        //创建文件输出流对象
        FileWriter fileWriter=null;
        try {
            fileWriter=new FileWriter(filePath,true);
            fileWriter.write('H');//写入单个字符
            fileWriter.write("韩顺平教育".toCharArray(),0,3);//写入数组指定部分
            fileWriter.write("动力节点");//写入一个字符串
            fileWriter.write("\thtml+css",0,8);





        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //fileWriter一定要关闭这个流或者flush
            try {
                fileWriter.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
