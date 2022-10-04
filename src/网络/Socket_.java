package 网络;


import org.junit.Test;

import java.net.ServerSocket;
import java.net.Socket;

/*
* Socket
*   介绍：
*       1.套接字(Socket)开发网络应用程序被广泛采用，以至于成为事实上的标准
*       2.通信的两端都要有Socket，是两台机器通信的端点
*       3.网络通信其实就是Socket间的通信
*       4.socket允许程序把网络连接当成一个流，数据在两个socket之间通过IO传输
*       5.一般客户端主动发起通信
* socket有两种编程
*   1.TCP编程
*
*   2.UDP编程
*
* */
public class Socket_ {
    public static void main(String[] args)throws Exception {
        //连接到服务器
        Socket socket = new Socket("192.168.86.1", 8888);
        //发送消息


    }
    @Test
    public void Server()throws Exception{
        //建立服务的端口
        ServerSocket serverSocket=new ServerSocket(8888);
        //监听客户端连接，阻塞式监听
        Socket socket=serverSocket.accept();
        //接收消息


    }
}
