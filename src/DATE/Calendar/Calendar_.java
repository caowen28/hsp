package DATE.Calendar;

import java.util.Calendar;

public class Calendar_ {
    public static void main(String[] args) {
        /*
        * Calendar类为抽象类且构造器为protected
        * 可以通过getInstance()获取实例
        * */

        Calendar c= Calendar.getInstance();//创建日期类对象
        System.out.println("当前日期类对象:"+c);

        //获取Calendar某个日历对象
        System.out.println("年："+c.get(Calendar.YEAR));
        System.out.println("月:"+(c.get(Calendar.MONTH)+1));//月份是从0开始编号的
        System.out.println("日:"+c.get(Calendar.DAY_OF_MONTH));
        System.out.println("时:"+c.get(Calendar.HOUR_OF_DAY));
        System.out.println("分:"+c.get(Calendar.MINUTE));
        System.out.println("秒:"+c.get(Calendar.SECOND));

    }
}
