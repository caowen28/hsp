package DATE;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

//      format()将date类转换为string类
//      parse（）将string转换成date类
public class date01 {
    public static void main(String[] args) throws ParseException {
        //获取当前时间
        Date date1=new Date();
        System.out.println("当前时间转换前:"+date1);//默认输出格式为国外的，因此通常要对日期进行设置，即SimpleDateFormat

        SimpleDateFormat sd=new SimpleDateFormat("yyyy年MM月dd日 hh:mm:ss");
        String sd01=sd.format(date1);
        System.out.println("当前时间转换后:"+sd01);

        //通过指定毫秒数得到时间
        Date date2=new Date(123456);
        System.out.println("获取123456时间后的日期:"+date2);//获取某个时间对应的毫秒数

        //将字符串转化成date
        String str="1997年8月22日 10:20:30";
        Date strdate=sd.parse(str);
        System.out.println("str->date:"+strdate);



    }
}
