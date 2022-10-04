package String类;

public class format {
    public static void main(String[] args) {
        String name="hsp";
        int age=20;
        char gender='男';
        float score=99.901f;
        String formatstr="我的姓名是%s 年龄是%d 性别是%c 成绩是%.2f";
        String s=String.format(formatstr,name,age,gender,score);
        System.out.println(s);
        //解读:%s %d %c %.2f这些都为占位符
        //占位符由后面的变量代替
        //%s用字符串代替 %d用整数代替 %c用字符代替 %。2f由浮点型代替（四舍五入）
        //
        //
    }
}
