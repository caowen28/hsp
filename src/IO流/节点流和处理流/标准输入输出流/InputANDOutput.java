package IO流.节点流和处理流.标准输入输出流;

/*
* 介绍:
*                           类型                  默认设备
*  System.in  标准输入流     InputStream         键盘
* System.out  标准输出流     PrintStream         显示器
*
* */

public class InputANDOutput {

    public static void main(String[] args) {
        //system类的         public static final InputStream in = null;
        //system.in 的编译类型   InputStream
        //system.in 的运行类型   BufferedInputStream
        System.out.println(System.in.getClass());


        //system类的       public static final PrintStream out = null;
        //编译类型  PrintStream
        //运行类型  PrintStream
        System.out.println(System.out.getClass());

    }
}
