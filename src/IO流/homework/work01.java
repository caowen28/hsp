package IO流.homework;

import java.io.*;

/*
* 判断d盘有没有mytemp文件夹，如果没有就创建
* 在mytemp文件夹判断是否有hello.txt文件，如果没有就创建，有就提示该文件已存在，并写入hello，java
*
* */
public class work01 {

    public static void main(String[] args)throws Exception {
        String dirpath="d:\\mytemp";//目录地址
        File file=new File(dirpath);
        if(!file.exists()){
            //创建
            if(file.mkdir()){
                System.out.println("创建"+dirpath+"创建成功");
            }else{
                System.out.println("创建失败");
            }
        }
        String filePath=dirpath+"\\hello.txt";//文件地址
        file=new File(filePath);
        if(!file.exists()){
            //创建文件
            if(file.createNewFile()){
                System.out.println(filePath+"创建成功");
                //如果文件存在，则写入内容
                BufferedWriter bufferedWriter=new BufferedWriter(new FileWriter(file));
                bufferedWriter.write("hello,java");
                bufferedWriter.close();
            }else{
                System.out.println("创建失败");
            }
        }else {
            System.out.println("文件已存在");
        }

    }
}
