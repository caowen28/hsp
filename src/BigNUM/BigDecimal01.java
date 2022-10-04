package BigNUM;

import java.math.BigDecimal;

public class BigDecimal01 {
    public static void main(String[] args) {
        double d=199.91234568574645666666;//最大取小数点后14位，大于14位四舍五入
        System.out.println("double:"+d);
        //如果需要保存精度特别高的浮点数则用BigDecimal
        BigDecimal bigDecimal=new BigDecimal("199.237465833936254756483658");
        System.out.println("bigdecimal:"+bigDecimal);
        BigDecimal b=new BigDecimal("30000000");
        //运算方法与BigInteger相同
        System.out.println("add:"+bigDecimal.add(b));
        System.out.println("subtract:"+bigDecimal.subtract(b));
        System.out.println("multify:"+bigDecimal.multiply(b));
        System.out.println("divide:"+bigDecimal.divide(b,BigDecimal.ROUND_CEILING)); //可能会抛出异常，解决方法-》添加精度(结果保留到分子的精度)
            
    }
}
