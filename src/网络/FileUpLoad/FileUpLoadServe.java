package 网络.FileUpLoad;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class FileUpLoadServe {

    public static void main(String[] args) throws Exception {
        //1.服务端在本机监听
        ServerSocket serverSocket=new ServerSocket(8888);
        System.out.println("服务器在端口8888监听");
        //2.等待连接
        Socket socket = serverSocket.accept();

        BufferedInputStream inputStream=new BufferedInputStream(socket.getInputStream());
        OutputStream outputStream=new FileOutputStream("src:\\pic.png");
        byte[] bytes=new byte[1024];
        int readline=0;
        while ((readline=inputStream.read(bytes))!=-1){
            outputStream.write(bytes);
        }
        outputStream.close();
        socket.shutdownOutput();






    }
}
