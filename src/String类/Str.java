package String类;

public class Str {
    public static void main(String[] args) {
       //string类是final类，不能被其他类继承
        //final修饰基本类型值不可以修改，修饰引用类型时地址不可以修改
        String name="hsp";
        name="Tom";

        final char[] arr={'a','b','c'};
        char[] arr2={'q','w','e'};
       //arr=arr2;//error ->arr只能指向一个地址
        arr[0]='z';//final修饰，可以修改值但不能修改地址



        char[] ch1={'a','b','c'};
        char[] ch2={'q','w','e'};
        ch1=ch2;
    }
}
