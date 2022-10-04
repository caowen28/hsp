package IO流.homework;

import org.junit.Test;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.InputStreamReader;

/*
* 使用BufferedReader读取文本文件，为每一行加上行号
* 连同内容一起输出到屏幕
*
* */
public class work02 {

    public static void main(String[] args)throws Exception {
        String filepath="d:\\mytemp\\hello.txt";
        BufferedReader bufferedReader=new BufferedReader(new FileReader(filepath));
        String readline="";
        int i=0;
        while((readline=bufferedReader.readLine())!=null){
            System.out.println((++i)+"\t"+readline);
        }
        bufferedReader.close();
    }
    @Test
    public void ex()throws Exception{
        String filepath="d:\\mytemp\\hello.txt";
        InputStreamReader in=new InputStreamReader(new FileInputStream(filepath),"gbk");
        BufferedReader bufferedReader=new BufferedReader(in);
        String readline="";
        int i=0;
        while((readline=bufferedReader.readLine())!=null){
            System.out.println((++i)+"\t"+readline);
        }
        bufferedReader.close();


    }
}
