package IO流.二进制文件拷贝;


import java.io.*;

//演示拷贝二进制文件
//字节流可以操作二进制文本文件，也可以操作文本文件
public class BufferIn$OutputStream_ {

    public static void main(String[] args) {
        String srcfilePath="D:\\pj03.PNG";
        String destfilePath="D:\\test.PNG";
        //创建对象
        BufferedInputStream bufferedInputStreamm=null;
        BufferedOutputStream bufferedOutputStream=null;
        try {//因为fileInputStream是InputStream的子类
            bufferedInputStreamm=new BufferedInputStream(new FileInputStream(srcfilePath));
            bufferedOutputStream=new BufferedOutputStream(new FileOutputStream(destfilePath));
            //循环读取文件,写到descfilePath中
            byte[] bytes=new byte[1024];
            int readline=0;
            while ((readline=bufferedInputStreamm.read(bytes))!=-1){
                bufferedOutputStream.write(bytes,0,readline);
            }
            System.out.println("文件拷贝完成");

        } catch (IOException e) {
            e.printStackTrace();
        } finally {//关闭流
            if(bufferedInputStreamm!=null||bufferedOutputStream!=null){
                try {
                    bufferedInputStreamm.close();
                    bufferedOutputStream.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
