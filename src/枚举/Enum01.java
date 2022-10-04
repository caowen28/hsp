package 枚举;

import String类.Str;

public class Enum01 {

    public static void main(String[] args) {
        System.out.println(Season.SPRING);
    }
}
//演示自定义枚举
class Season{
    private String name;
    private String desc;
    //定义了4个对象
    public final static Season SPRING=new Season("春天","温暖");
    public final static Season SUMMER=new Season("夏天","炎热");
    public final static Season AUTUMN=new Season("秋天","凉爽");
    public final static Season WINTER=new Season("冬天","寒冷");



    private Season(String name, String desc) {
        this.name = name;
        this.desc = desc;
    }
    //将构造器私有化，防止new对象
    //去掉setter方法，防止属性被修改
    //创建固定的对象
    public String getName() {
        return name;
    }

    public String getDesc() {
        return desc;
    }

    @Override
    public String toString() {
        return "Season{" +
                "name='" + name + '\'' +
                ", desc='" + desc + '\'' +
                '}';
    }
}