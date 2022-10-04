package 网络.TCP网络通信编程;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetAddress;
import java.net.Socket;

public class client {
    public static void main(String[] args)throws  Exception {
        Socket socket=new Socket(InetAddress.getLocalHost(),9999);
        System.out.println("客户端socket"+socket);
        //发送
        OutputStream outputStream=socket.getOutputStream();
        BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
        bufferedWriter.write("hello sever,string");
        bufferedWriter.flush();
        //结束标记
        bufferedWriter.newLine();
        //接收

        //BufferedReader bufferedReader=new BufferedReader();


    }
}
