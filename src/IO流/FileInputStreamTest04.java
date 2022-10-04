package IO流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileInputStreamTest04 {
    //最终版，需要掌握
    public static void main(String[] args) {
        FileInputStream fis=null;
        try {
            fis=new FileInputStream("c:/iotest.txt");
            //准备一个byte[]
            byte[] bytes=new byte[4];
            while(true) {
                try {
                    int readline = fis.read(bytes);
                    if(readline==-1){
                        break;
                    }
                    System.out.print(new String(bytes,0,readline));
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
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
