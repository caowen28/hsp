package 网络.TCP网络通信编程;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class sever {
    public static void main(String[] args)throws Exception {
        ServerSocket seversocket=new ServerSocket(9999);
        System.out.println("服务器端等待连接");
        Socket socket1=seversocket.accept();
        System.out.println(socket1.getClass());
        //接收
        BufferedReader bufferedReader=new BufferedReader(new InputStreamReader(socket1.getInputStream()));
        System.out.println(bufferedReader.readLine());
        //输出
        OutputStream outputStream=socket1.getOutputStream();
      BufferedWriter bufferedWriter=new BufferedWriter(new OutputStreamWriter(outputStream));
      bufferedWriter.write("hello client,str");
      socket1.shutdownOutput();


    }
}
