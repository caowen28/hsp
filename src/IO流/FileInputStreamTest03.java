package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/*
        int read(byte[] b)
        一次最多读取b.length个字节
        减少内存与硬盘的交互


 */
public class FileInputStreamTest03 {
        /*
        相对路径：从当前所在位置作为起点开始寻找
        idea默认当前路径：工程project的根就是idea默认的起点位置
        */
    public static void main(String[] args)throws IOException {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("C://iotest.txt");
            byte[] bytes=new byte[4];
            int readcount=fis.read(bytes);//返回值int，返回读到的字节数量,返回-1表示没读到
            System.out.println(readcount);
            System.out.println(new String(bytes,0,readcount));//将字节数组全部转化成字符串
            readcount= fis.read(bytes);
            System.out.println(readcount);
            System.out.println(new String(bytes,0,readcount));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (fis != null) {
                fis.close();
            }
        }


    }
}
