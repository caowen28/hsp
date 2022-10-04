package 网络.TCP网络通信编程;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetAddress;
import java.net.Socket;

public class SocketClient {

    public static void main(String[] args) throws Exception{
        //1.连接服务端(ip,端口)
        //解读:连接本地的9999端口，如果连接返回socket对象
        Socket socket = new Socket(InetAddress.getLocalHost(), 9999);
        System.out.println("客户端socket="+socket);
        //得到和socket关联的输出流对象
        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("hello,sever".getBytes());
        socket.shutdownOutput();
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int readline=0;
        while((readline=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readline));
        }


        //关闭流和socket
        outputStream.close();
        socket.close();
        inputStream.close();
        System.out.println("客户端退出");
    }
}
