package 泛型;

import String类.Str;

public class MainClass {
    /*
    * 提高代码复用性
    * 避免转换
    * */
    public static void main(String[] args) {
        Generic<String> g=new Generic<>("jack");//创建泛型类对象
        String k=g.getKey();
        System.out.println(k);

        System.out.println("++++++++++Integer++++++++++++");
        Generic<Integer> g1=new Generic<>(20);
        int k2=g1.getKey();
        System.out.println(k2);

        System.out.println("+++++++++++不加类型，默认按照Object操作+++++++++++++");
        Generic g3=new Generic(123);
        Object k3=g3.getKey();
        System.out.println(k3);

    }
}
