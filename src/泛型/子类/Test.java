package 泛型.子类;

public class Test {

    public static void main(String[] args) {
        System.out.println("============子类泛型，父类泛型===========");
        Child01<String> childFirst=new Child01<>();
        childFirst.setValue("abc");
        String value=childFirst.getValue();
        System.out.println(value);
        System.out.println("============子类无泛型，父类有泛型========");
        Child02 c2=new Child02();
        c2.setValue("jack");
        String str=c2.getValue();
        System.out.println(str);

    }
}
