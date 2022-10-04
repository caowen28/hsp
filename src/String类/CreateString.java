package String类;

public class CreateString {

    public static void main(String[] args) {
        //两种创建String对象的区别
        String s1="hsp";//方式1
        String s2=new String("HSP");//方式2
        /*
        * 方式1：先从常量池查看是否有hsp，如果有直接指向；如果没有先创建再指向，最终指向的是常量池中的地址
        * 方式2：先创建堆空间，里面维护了value属性，指向常量池的空间如果没有先创建再指向，如果有直接指向，最终指向堆空间的地址
        * */


    }
}
