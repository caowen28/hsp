package 枚举;

public class Enum02 {
    public static void main(String[] args) {
        System.out.println(Season02.AUTUMN);
    }
}
//使用enum关键字实现枚举
//1.使用enum代替class
//2.构造器直接使用
//3.如果有多个常量使用 ,连接

/*
* 当我们使用enum关键字开发枚举类时，默认会继承Enum类
*
* */
enum Season02{
    //定义的常量对象写到最前面
   SPRING("春天","温暖"),SUMMER("夏天","炎热"),AUTUMN("秋天","凉爽"),WINTER("冬天","寒冷"),
    wate;//等价于wate()  采用的是无参构造

    private String name;
    private String desc;
    private Season02(){}
    private Season02(String name, String desc) {
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