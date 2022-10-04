package 网络.FileUpLoad;

import java.io.*;
import java.net.InetAddress;
import java.net.Socket;

public class FileUpLoadClient {

    public static void main(String[] args)throws Exception {
            //创建客户端连接
        Socket socket = new Socket(InetAddress.getLocalHost(),8888);
        //创建读取磁盘文件的输入流
        BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream("d:\\pj03.png"));
        ByteArrayOutputStream byteArrayOutputStream=new ByteArrayOutputStream();
        byte[] bytes=new byte[1024];
        int readline=0;
        while ((readline=bufferedInputStream.read(bytes))!=-1){
             byteArrayOutputStream.write(bytes,0,readline);
        }
        byte[] arr=byteArrayOutputStream.toByteArray();

        BufferedOutputStream bufferedOutputStream=new BufferedOutputStream(socket.getOutputStream());
        bufferedOutputStream.write(arr);
        bufferedOutputStream.close();
        byteArrayOutputStream.close();
        socket.shutdownOutput();

    }
}
