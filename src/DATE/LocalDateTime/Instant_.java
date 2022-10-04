package DATE.LocalDateTime;

import java.time.LocalDateTime;
import java.util.Date;
import java.time.Instant;
/**
 * 第三代日期类更多方法
 *LocalDateTime类
 * MonthDay类：检查重复时间
 *是否是闰年
 * 增加日期的某个部分
 *
 */

public class Instant_ {
    public static void main(String[] args) {
        //Instant 时间戳

        //1.通过静态方法now()获取当前时间戳的对象
        Instant now=Instant.now();
        System.out.println("当前日期时间戳:"+now);

        //2.通过Date的from()将Instant转换成Date
        Date d= Date.from(now);
        System.out.println("instant->date:"+d);

        //2.通过Date的toInstant()将Date转换成Instant
        Instant in=d.toInstant();
        System.out.println("date->instant: "+in);

        //使用plus和minus对当前日期进行加减
        LocalDateTime ldt=LocalDateTime.now();//获取当前日期
        LocalDateTime new01=ldt.plusDays(365);
        System.out.println("plus 365:"+new01);
        new01=ldt.minusHours(200);
        System.out.println("minus 200hours:"+new01);


    }
}
