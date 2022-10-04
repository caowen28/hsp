package IO流;

/*
* IO
* 1.I是intput
* 2.O是output
* 通过IO可以完成硬盘文件的读写
*
* 3.io流的分类
*       1.一种方式是按照流的方向进行分类
*               以内存为参照物
*               往内存中去叫输入，或读
*               从内存中出去叫输出，或写
*       2.一种方式是按照读取数据方式不同进行分类
*               有的流是按照字节的方式读取，一次读取一个字节（8位）这种流是万能的，什么类型文件都能读取（文本，图片，声音，视频。。。。）
*           假如有一个文件，内容是a中国bc张三fe
*               第一次读取一个字节  读到‘a’
*               第二次读取一个字节  读到'中'字符的一半  （在windows中一个字母占一个字节，一个汉字占两个字节）
*               第三次读取一个字节  读到‘在’字符的另一半
*               有的流是按照字符的方式读取，一次读取一个字符，这种流是方便读取普通文本而存在的，只能读取普通文件.txt（无法读取word文件）
*               第一次读取一个字节  读到‘a’
 *               第二次读取一个字节  读到'中'
 *               第三次读取一个字节  读到 '国'
 *
 *      综上所述：流的分类
 *              输入流，输出流
 *              字节流，字符流
*       java中所有的流都在io包下
*
*       java中的4大家族
*       java.io.InputStream   字节输入流
*       java.io.outputStream  字节输出流
*       java.io.Reader        字符输入流
*       java.io.Writer        字符输出流
*   注意：在java中只要以stream结尾的都是字节流，以Reader或Writer结尾的都是字符流
*       所有流都实现了java.io.closeable接口，都可关闭，都有close方法
*       流是一个管道，是内存和硬盘之间的通道，用完之后一定要关闭，不然会消耗很多资源
*       所有的输出流都是可刷新的，刷新的作用就是清空管道
*       如果不使用flush方法可能会丢数据
*
*
*       java IO包下需要掌握的流有16个
*           文件专属
*           java.io.FileInputStream
*           java.io.FileOutputStream
*           java.io.FileReader
*           java.io.FileWriter
*           转换流（将字节流转换为字符流）
*            java.io.InputStreamReader
*            java.io.outPutStreamWriter
*           缓冲流专属
*            java.io.BufferedReader
*            java.io.BufferedWriter
*            java.io.BufferedInputStream
*            java.io.BufferedOutputStream
*            数据流专属
*            java.io.DateInputStream
*            java.io.DateOutputStream
*            对象专属流
*            java.io.ObjectInputStream
*            java.io.ObjectOutputStream
*            标准输出流
*            java.io.PrintWriter
*            java.io.PrintStream
*
*
*  */

public class demo01 {

    public static void main(String[] args) {

    }
}
