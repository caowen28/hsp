package IO流.file;

import org.junit.Test;

import java.io.File;
import java.io.IOException;

/*
* 文件在程序中以流的形式操作
* 流：磁盘文件与程序之间的路径
* 输入流：数据从磁盘到程序之间的路径
* 输出流:数据从程序到磁盘的路径
*
* 创建文件的构造方法
* new File(String pathName)   根据路径构造File对象
* new File(File parent,String child)  根据父目录文件+子路径构建对象
* new File(String parent,String child) 根据父路径和子路径构建对象
*
*
* 目录的操作和文件的删除
*   mkdir()创建一级目录
*   mkdirs()创建多级目录
* delete()删除空目录或文件
*
*
*
*
* */
public class file01 {

    public static void main(String[] args) {


    }
    //在d盘创建文件news1.txt,news2.txt,news3.txt
    @Test
    public void new01(){
        String path="d:\\news1.txt";
        File file=new File(path);//在内存中创建
        try {
            file.createNewFile();//此方法是在磁盘中创建了file文件
            System.out.println("文件创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void new02(){
        //根据父目录文件+子路径构建
        File parentFile=new File("d:\\");
        String fileName="new2.txt";
        File file=new File(parentFile,fileName);
        try {
            file.createNewFile();
            System.out.println("new2.txt创建成功");
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
    @Test
    public void new03(){
        //根据父目录+子路径构建
        String parent="d:\\";
        String fileName="new3.txt";
        File file=new File(parent,fileName);
        try {
            file.createNewFile();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }
    //获取文件的信息
     @Test
    public void info() {
        //先创建文件对象
        File file = new File("d:\\news1.txt");
        //调用相应的方法，得到对应信息
        System.out.println("文件名字=" + file.getName());
        //getName、getAbsolutePath、getParent、length、exists、isFile、isDirectory
         System.out.println("文件绝对路径=" + file.getAbsolutePath());
         System.out.println("文件父级目录=" + file.getParent());
         System.out.println("文件大小(字节)=" + file.length());
         System.out.println("文件是否存在=" + file.exists());//T
         System.out.println("是不是一个文件=" + file.isFile());//T
         System.out.println("是不是一个目录=" + file.isDirectory());//F
    }

    @Test
    public void del(){
        //判断 d:\\new1.txt是否存在，存在就删除
        File file=new File("d:\\news1.txt");
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("不存在该文件");
        }

    }

    @Test
    public void del2(){
        //判断 d:\\demo02是否存在，存在就删除
        File file=new File("d:\\demo02");
      //  System.out.println(file.isFile());
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("不存在该文件");
        }

    }
    @Test
    public void del3(){
        //判断 d:\\demo\\a\\b\\c目录是否存在，不存在就创建
        File file=new File("d:\\demo\\a\\b\\c");
        if(file.exists()){
            file.delete();
            System.out.println("删除成功");
        }else {
            System.out.println("不存在该文件,创建");
            file.mkdirs();
            System.out.println("创建完成");
        }

    }


}
