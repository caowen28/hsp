package 泛型.泛型接口;

public class Test {

    public static void main(String[] args) {
        Apple apple=new Apple();
        String str=apple.getKey();
        System.out.println(str);
        System.out.println("+++++++++++++++++");
        Pair<String ,Integer> p=new Pair<>("count",100);
        String key=p.getKey();
        Integer in=p.getValue();
        System.out.println(key+";"+in);

    }
}
