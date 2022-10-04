package String类;

public class CompareTo {
    public static void main(String[] args) {
        String a="ac";//创建a对象
        String b="abcdef";//创建b对象
        System.out.println("a.compareTo(b)="+ a.compareTo(b));//c-b 返回1
        a="abcd";
        b="abcd";
        System.out.println("a.compareTo(b)="+ a.compareTo(b));// 0
        a="abz";
        b="abc";
        System.out.println("a.compareTo(b)="+ a.compareTo(b));//23
        a="a";
        b="efg";
        System.out.println("a.compareTo(b)="+ a.compareTo(b));//-4
        //compareTo方法比较字符串时先将每位上的字符逐个比较，如果每位上的字符相同且长度相等则返回0
        //如果字符相同但长度不同则返回前-后的长度
        //如果比较时直至遇到前大（后大）则不考虑两字符串的长度，返回前-后的长度
    }
}
