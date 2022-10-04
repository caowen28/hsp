package StringBuffer;

public class question01 {

    public static void main(String[] args) {
        //看看下列代码输出什么
        String str=null;
        StringBuffer sb=new StringBuffer();
        sb.append(str);//底层调用AbstractStringBuilder的appendNull
        System.out.println(sb.length());//4
        System.out.println(sb);
        StringBuffer sb01=new StringBuffer(str);//看源码：super（str）
        System.out.println(sb01);//抛出空指针异常
    }
}
