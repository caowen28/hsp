package 包装类;

public class IntergerStr {
    public static void main(String[] args) {
        //包装类(Integer)-->String
        //方式一
        Integer i=100;//自动装箱
        String s=i+"";
        //方式二
        String s2=i.toString();
        //方式三
        String s3=String.valueOf(i);


        //String-->Integer
        String ss="123";
        Integer j1=Integer.parseInt(ss);
       Integer j2=new Integer(ss);

       //手动装箱
        Integer ii=Integer.valueOf(20);

        //手动拆箱
        Integer num=10;
        int numm=num.intValue();



    }
}
