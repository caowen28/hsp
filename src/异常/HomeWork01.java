package 异常;

import java.util.Scanner;

public class HomeWork01 {
/*
* 编写程序接收命令行两个参数（整数）计算两数相除。
* 要求使用方法call（int n1,int n2）
* 对数据格式不正确，缺少命令行参数。除0进行异常处理
*
* */
    public static double call(int n1,int n2)throws ArithmeticException{
        return n1/n2;
    }
    public static void main(String[] args) {
        //验证参数个数
        try {
            if(args.length!=2){
                throw new ArrayIndexOutOfBoundsException("缺少参数");
            }
            int n1=Integer.parseInt(args[0]);
            int n2=Integer.parseInt(args[1]);
            double res=call(n1,n2);
            System.out.println(res);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("参数格式不正确");
        }catch (ArithmeticException e){
            System.out.println("除0");
        }


    }
}
