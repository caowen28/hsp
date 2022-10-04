package StringBuffer;

public class StringBuffer01 {
    public static void main(String[] args) {
        //StringBuffer的直接父类是AbstractStringBuilder
        //StringBuffer实现了Serizable,即StringBuffer的对象可以串行化
        //在其父类中AbstractStringBuilder有属性char[] value,不是final，该value数组存放字符串，因此存放在堆中
        //StringBuffer是final类，因此不能被继承

        //创建一个大小为16char[]用于存放字符串，默认就是16
        StringBuffer sb=new StringBuffer();
        //通过构造器指定大小
        StringBuffer  sb01=new StringBuffer(100);
        //通过tring创建StringBuffer对象
        StringBuffer sb02=new StringBuffer("hello");//默认容器容量为当前字符串长度+16

        //StringBuffer-->String
        String str= sb02.toString();//method1
        String sb05=new String(sb02);//method2

        //String-->StringBuffer
        String str01="hsp";
        StringBuffer sb03=new StringBuffer(str01);//method1
        StringBuffer sb04=new StringBuffer();
        sb04.append(sb01);//method2


    }
}
