package IO流.文件拷贝;

import IO流.OutputStream.FileOutputStream_;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileCopy {


    public static void main(String[] args) {
        //完成文件拷贝  将e:\\kaola.jpg拷贝到c:\\
        /*
        * 思路:
        * 1.创建文件输入流，将文件读取到程序
        * 2.创建文件输出流，将读取到的指定文件数据写到文件中
        * 在完成程序时，应该是先读取一部分数据就写入到指定文件，用循环
        * */
              //要拷贝的图片位置
            String filePath="C:\\Users\\Administrator\\Desktop\\软件工程\\pj03.PNG";
            //拷贝到的位置
            String aimmed="c:\\IOimg.PNG";
            //创建文件输入流
        FileInputStream  fileInputStream=null;
        FileOutputStream fileOutputStream=null;

        try {
            fileInputStream=new FileInputStream(filePath);
            fileOutputStream=new FileOutputStream(aimmed);
            //定义一个字节数组，提高代码效率
            byte[] bytes=new byte[1024];
            int readLine=0;
            while((readLine=fileInputStream.read(bytes))!=-1){
                    //读取到后就写入
                fileOutputStream.write(bytes,0,readLine);
            }
            System.out.println("拷贝成功");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                fileInputStream.close();
                fileOutputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


}
