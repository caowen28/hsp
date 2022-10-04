package 异常;

import java.util.Scanner;

public class try_catch {

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String str="";
        int n=0;
        while(true){
            try {
                System.out.println("请输入一个整数");
                str=sc.next();
                n=Integer.parseInt(str);//将字符串转化为整形
                break;
            } catch (NumberFormatException e) {
                System.out.println("输入错误，请再输一遍");
            }


        }
        System.out.println("输出结果:"+n);


    }
}
