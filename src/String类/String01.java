package String类;

public class String01 {

    public static void main(String[] args) {
             String a="ac";//创建a对象
             String b="abcnnnn";//创建b对象
             String c=a+b;
        System.out.println("a.compareTo(b)="+ a.compareTo(b));
        /*
         * 先创建一个StringBuilder sb=new StringBuilder()
         * 执行sb.append("hello")
         * 再执行sb.append("abc")
         * 最后执行sb.toString()
         * */

      //  System.out.println("=============================");
        String s="welcome"+"tojava";
        //创建了几个对象?
        //一个
        //解读:String s="welcome"+"tojava" 等价于 String s="welcomrtojava"
        //编译器做了优化因为welcome和tojava如果在常量池开辟两空间存放，但并没有对象指向它们；所以编译器优化后直接在常量池开辟一个
        //空间存放welcometojava



    }
}
