package StringBuilder;

public class Builder01 {
    /*
    * 一个可变字符串序列，此类提供了与StringBuffer兼容的API，但不保证同步
    * 单线程的情况下建议优先考虑此类因为大多情况下比StringBuffer更快
    * 不是线程安全
    *StringBuilder是final类不能被继承
    * StringBuilder对象存放在其父类AbstractStringBuilder中的char[] value,因此字符存放在堆中
    *  */

    /*
    * StringBuffer可变字符串，效率较高，线程安全
    * StringBuilder可变字符串，效率最高，线程不安全
    *
    *
    * String注意事项
    * String s="a";//创建一个字符串
    * s+=“b”//原来的a字符串已丢失，s指向一个新的字符串ab，如果多次执行该操作对导致无用数据堆积在内存中造成资源浪费
    * */
    public static void main(String[] args) {




    }
}
