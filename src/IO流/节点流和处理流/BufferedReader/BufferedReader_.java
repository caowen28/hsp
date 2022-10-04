package IO流.节点流和处理流.BufferedReader;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedReader_ {

    public static void main(String[] args)throws  Exception {
        String filePath="c:\\hello.txt";
        //创建BufferedReader
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filePath));
        //读取
        String line;//按行读取，效率高

        while(( line=bufferedReader.readLine())!=null){
            System.out.println(line);
        }
        //关闭流
        System.out.println("流已关闭");
        bufferedReader.close();

    }
}
