package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
*       java.io.FileInputStream:
*           1.文件字节输入流，万能的，任何类型文件都可以用这个流读取
*           2.字节的方式  完成输入的操作，完成读的操作（硬盘-》内存）
*           3.使用FileInputStream要抛出异常
* */
public class FileInputStreamTest01 {

        //程序的缺点：一次存储一个字节，硬盘和内存交互太频繁，浪费时间资源
        // 该方法不用
    public static void main(String[] args)throws IOException {
        //创建文件字节输入流的对象
        //文件路径（idea会自动将\转换成\\）
        FileInputStream fis=null;
        try {
                fis=new FileInputStream("C://iotest.txt");//记得加后缀
            while(true) {
                int readline = fis.read();//读取文件,这个方法的返回值是读取到的字节的本身，如果读不到就返回-1
                if (readline == -1) {
                    break;
                }
                System.out.println(readline);
            }
            //改造while循环
            int readl=0;
            while((readl= fis.read())!=-1){
                System.out.println(readl);
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }finally {
            //在finally里确认流一定要关闭
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }


    }
}
