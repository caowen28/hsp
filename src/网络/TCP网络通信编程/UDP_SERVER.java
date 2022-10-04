package 网络.TCP网络通信编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

public class UDP_SERVER {
    public static void main(String[] args)throws Exception {
        //开放端口
        DatagramSocket socket=new DatagramSocket(9090);
        //接收数据包
        byte[] bytes=new byte[1024];
        DatagramPacket packet=new DatagramPacket(bytes,0,bytes.length);
        socket.receive(packet);//阻塞接收
        System.out.println(packet.getAddress().getHostAddress());
        System.out.println(new String(packet.getData()));
        socket.close();


    }
}
