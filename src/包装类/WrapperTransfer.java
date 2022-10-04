package 包装类;

public class WrapperTransfer{
//包装类和基本数据类型的转换

/*
* 以int和Integer演示
* JDK5前的手动装箱和拆箱，装箱：基本类型——>包装类型   反之拆箱
* JDK5之后的自动装箱拆箱
* */
    public static void main(String[] args) {

//JDK5之前的
        //基本类型到包装类（手动装箱）
        int i=10;
        Integer i1=new Integer(i);
        Integer i2=Integer.valueOf(i);
        //包装类——>基本类（手动拆箱）
        Integer j1=new Integer(20);
        int j2=j1.intValue();

//JDK5之后的
        //自动装箱
        int m=100;
        Integer m2=m;
        //自动拆箱
        Integer n=new Integer(30);
        int n2=n;


    }
    }

