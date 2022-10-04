package String类;

public class String02 {

    public static void main(String[] args) {


        //intern(),调用该方法时如果池中已包含一个等于此String对象的字符串（用equals(Object obj)方法确定）则返回池中字符串，否则向池中
        //添加该字符串并返回
        String aa="hsp";
        String bb=new String("hsp");
        System.out.println(aa.equals(bb));//true
        System.out.println(aa==bb);//false
        System.out.println(aa==bb.intern());//true
        System.out.println(bb==bb.intern());//false   bb.intern指向常量池，bb指向堆内存

    }
}
