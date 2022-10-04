package 网络.TCP网络通信编程;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class UDP_client {

    public static void main(String[] args)throws Exception {
        //1.建立一个socket
        DatagramSocket socket=new DatagramSocket();
        //2.建一个包
        String str="hello,messgae";
        InetAddress address=InetAddress.getByName("localhost");
        DatagramPacket datagramPacket = new DatagramPacket(str.getBytes(), 0, str.getBytes().length, address, 9090);
        //3.发送包
        socket.send(datagramPacket);
        socket.close();

    }
}
