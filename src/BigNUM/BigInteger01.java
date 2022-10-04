package BigNUM;

import java.math.BigInteger;

public class BigInteger01 {
    public static void main(String[] args) {
long l=1111111111111l;
BigInteger bigInteger=new BigInteger("2222222222222222222222222222222222222222");
        System.out.println(bigInteger);
        //在对bigInteger进行加减乘除时需使用对应的方法，不能直接运算

        //加法运算
        BigInteger bigInteger1=new BigInteger("200");
        BigInteger add=bigInteger1.add(bigInteger);
        System.out.println("add:"+add);
        //减法运算
        BigInteger subtract=bigInteger1.subtract(bigInteger);
        System.out.println("subtract:"+subtract);
        //乘法运算
        BigInteger multiply=bigInteger1.multiply(bigInteger);
        System.out.println("multify:"+multiply);
        //除法运算
        BigInteger divide=bigInteger1.divide(bigInteger);
        System.out.println("divide:"+divide);

    }
}
