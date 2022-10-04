package DATE.LocalDateTime;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LocalDate {
    public static void main(String[] args) {
        //第三代日期
        LocalDateTime ldt=LocalDateTime.now();//LocalDate.now();LocalTime.now()
        System.out.println(ldt);
        System.out.println("年:"+ldt.getYear());
        System.out.println("月:"+ldt.getMonth());
        System.out.println("月:"+ldt.getMonthValue());
        System.out.println("日:"+ldt.getDayOfMonth());
        System.out.println("时:"+ldt.getHour());
        System.out.println("分:"+ldt.getMinute());
        System.out.println("秒:"+ldt.getSecond());

        //格式化日期类DateTimeFormatter(类似于SimpleDateFormat)
        DateTimeFormatter dtf=DateTimeFormatter.ofPattern("yyyy年MM月dd hh:mm:ss");
        String str= dtf.format(ldt);
        System.out.println("转化格式："+str);



    }
}
