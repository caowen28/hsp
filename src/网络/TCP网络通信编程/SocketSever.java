package 网络.TCP网络通信编程;

import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/*
import java.net.Socket;代表一个套接字
import java.net.ServerSocket;为服务器程序提供一种监听客户端，并与它们建立连接的机制

    步骤:
    1.服务器实例化一个ServerSocket对象，表示通过服务器上的端口通信
    2.服务器调用Serversocket类的accept()方法，该方法将一直等待，直到客户端连接到服务器端
    3.服务器正在等待时，一个客户端实例化一个socket对象，指定服务器名和端口号请求连接
    4.socket类的构造函数试图将客户端连接到指定的服务器和端口号，如果通信被建立，则客户端创建一个socket对象能够与服务器进行通信
    5.服务器端，accept()方法返回服务器上一个新socket引用，该socket连接到客户端socket




* 编写一个服务器端，客户端
* 服务器在9999端口监听
* 客户端连接到服务器，发送“hello,sever”然后退出
* 服务器接收到客户端发送的信息，输出并退出
*
* */
public class SocketSever {
    public static void main(String[] args)throws Exception {
        //1.服务器实例化一个ServerSocket对象，表示通过服务器上的端口通信
        ServerSocket serverSocket=new ServerSocket(9999);//前提端口未被连接
        //2.服务器调用Serversocket类的accept()方法，该方法将一直等待，直到客户端连接到服务器端
        //没有客户端连接9999端口时，程序会阻塞，等待连接
        Socket socket=serverSocket.accept();
        System.out.println("服务器，在9999端口等待连接");
        System.out.println("服务器socket="+socket.getClass());
        //读取
        InputStream inputStream=socket.getInputStream();
        byte[] bytes=new byte[1024];
        int readline=0;
        while((readline=inputStream.read(bytes))!=-1){
            System.out.println(new String(bytes,0,readline));
        }

        OutputStream outputStream=socket.getOutputStream();
        outputStream.write("hello,client".getBytes());
        socket.shutdownOutput();
        inputStream.close();
        outputStream.close();
        socket.close();
        serverSocket.close();
    }

}
