package 网络;

import java.net.InetAddress;

public class InetAddress_ {

    public static void main(String[] args) throws Exception{

        //1.获取本机的InetAddress对象
        InetAddress inetAddress=InetAddress.getLocalHost();
        System.out.println(inetAddress);//usercaowen2865/192.168.86.1

        //2.根据指定的主机名，获取InetAddress对象
        InetAddress inetAddress1=InetAddress.getByName("usercaowen2865");
        System.out.println(inetAddress1);

        //3.根据域名返回InetAddress对象
        InetAddress inetAddress2=InetAddress.getByName("www.baidu.com");
        System.out.println(inetAddress2);

        //4.通过InetAddress获取对应地址
       String hostAddress=inetAddress2.getHostAddress();
        System.out.println(hostAddress);




    }
}
