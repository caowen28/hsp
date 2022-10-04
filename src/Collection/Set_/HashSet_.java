package Collection.Set_;

import java.util.HashSet;
import java.util.Set;

public class HashSet_ {
    public static void main(String[] args) {

        Set set=new HashSet();
        System.out.println(set.add("john"));
        System.out.println(set.add("lucy"));
        System.out.println(set.add("john"));
        System.out.println(set.add("jack"));
        System.out.println(set.add("rose"));
        set.remove("jack");

        System.out.println(set);
        System.out.println("============");
        set=new HashSet();
        set.add("lucy");//true
        set.add("lucy");//false
        set.add(new Dog("tom"));//true
        set.add(new Dog("tom"));//true
        System.out.println(set);

        //加深了解
        set.add(new String("hsp"));//true
        set.add(new String("hsp"));//fasle
        /*原因:
        *添加元素时会得到hash值转化成索引
        * 找到存储数据表，看索引位置有没有元素，如果没有直接加入否则调用equals方法比较，如果相同就放弃添加，不同则添加到最后
        * 在java8中如果一条链表元素个数超过8并且table>=64就会进行树化（红黑树）
        *
        */


    }
}
class Dog{
    private String name;

    public Dog(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                '}';
    }
}