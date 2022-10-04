package IO流.InputStream;
import java.io.FileInputStream;
import java.io.IOException;

/*
* 演示FileInputStream的使用（文件-->程序）
* */
public class FileInputStream_ {
    public static void main(String[] args) {
        new FileInputStream_().readFile01();
        new FileInputStream_().readFile02();
    }
    /*
    read()
    * 单个字节读取效率低
    * */
    public void readFile01(){
    String filePath="c:\\hello.txt";
    int readDate=0;
        FileInputStream fileInputStream=null;
        try {
            //创建fileInputStream对象读取文件
                 fileInputStream=new FileInputStream(filePath);
            //从该输入流读取一个字节，如果没有输入该方法结束
            //返回-1则表示读取结束
         //   readDate=fileInputStream.read();  返回值是 下一个字节的十进制表示
            //初始时read下标指向空，即第一个元素的前一个空 如 ！1234（！表示read一开始的位置）
            while((readDate=fileInputStream.read())!=-1){
                System.out.println((char)readDate+"返回值:"+readDate);
            }
          //  System.out.println("\n");
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭文件输入流，释放资源
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
    /*
     * 使用read(byte[] byte)方法读取文件
     * */
    public void readFile02(){
        String filePath="c:\\hello.txt";
        int readDate=0;
        byte[] bytes=new byte[6];
        FileInputStream fileInputStream=null;
        try {
            //创建fileInputStream对象读取文件
            fileInputStream=new FileInputStream(filePath);
            //从该输入流读取一个字节，如果没有输入该方法将阻止
            //返回-1则表示读取结束

            while((readDate=fileInputStream.read(bytes))!=-1){
                //如果读取正常则返回实际读取数
                System.out.print(new String(bytes,0,bytes.length));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                //关闭文件输入流，释放资源
                fileInputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }


}
