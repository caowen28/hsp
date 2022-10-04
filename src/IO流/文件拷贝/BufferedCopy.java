package IO流.文件拷贝;

import java.io.*;
/*
*注意:
*   BufferedReader和BufferWriter都是操作字符
*   不能操作二进制文件【声音，视频，doc,pdf等】，否则文件会损坏
*
* */
public class BufferedCopy {
    public static void main(String[] args) {
        String srcFilePath="c:\\hello.txt";
        String aimed="c:\\hello.txt";
        //创建Buffered对象
        BufferedReader bufferedReader=null;
        BufferedWriter bufferedWriter=null;
        String line="";
        try {
            bufferedReader=new BufferedReader(new FileReader(srcFilePath));
            bufferedWriter=new BufferedWriter(new FileWriter(aimed));
            //readline读取一行内容，但是没有换行
            while((line=bufferedReader.readLine())!=null){
                //没读一行写一行
                bufferedWriter.write(line);
                bufferedWriter.newLine();

            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //关闭流
            if(bufferedReader!=null){
                try {
                    bufferedReader.close();
                    bufferedWriter.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }
}
