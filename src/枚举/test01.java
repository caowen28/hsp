package 枚举;

public class test01 {

    public static void main(String[] args) {
        WEEK[] weeks=WEEK.values();
        System.out.println("所有星期如下");
        for (int i=0;i<weeks.length;i++){
            System.out.println(weeks[i]);
        }

    }
}
enum WEEK{
    MONDAY("星期一"),TUESDAY("星期二"),WEDNESDAY("星期三"),THURSDAY("星期四"),FRIDAY("星期五"),SATURDAY("星期六"),SUNDAY("星期天");
//    private static final WEEK SUNDAY=new WEEK("星期日");
//    private static final WEEK MONDAY=new WEEK("星期一");
//    private static final WEEK TUESDAY=new WEEK("星期二");
//    private static final WEEK WEDNESDAY=new WEEK("星期三");
//    private static final WEEK THURSDAY=new WEEK("星期四");
//    private static final WEEK FRIDAY=new WEEK("星期五");
//    private static final WEEK SATURDAY=new WEEK("星期六");


    private String name;

    private WEEK(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return  name ;
    }
}
