package Math;

public class Math01 {

    /*
    * 常用方法：
    * abs:绝对值
    * pow:求幂函数
    * ceil:向上取整
    * floor:向下取整
    * round:四舍五入
    * sqrt:求开方
    * random:求随机数
    * max:最大值
    * min:最小值
    * */
    public static void main(String[] args) {
        //1、求绝对值
        int a=Math.abs(-2);
        System.out.println("abs="+a);
        //2.pow求幂函数
        double po=Math.pow(2,4);//2的4次方
        System.out.println("pow="+po);
        //3.ceil
        double cei=Math.ceil(5.4789);
        System.out.println("ceil="+cei);
        //4.floor
        double floo=Math.floor(6.313);
        System.out.println("floor="+floo);
        //5.round
        double roun=Math.round(5.375);
        System.out.println("round="+roun);
        //6.sqrt
        double sqr=Math.sqrt(9.0);//如果开方数为负数则返回NaN
        System.out.println("sqrt="+sqr);
        //random,返回[0,1)的随机数
        double ran=Math.random();
        System.out.println("random="+ran);
        //请写出一个a~b的一个随机数，ab均为整数11,35
        int num=3+(int)(Math.random()*9);
        System.out.println(num);




    }
}
