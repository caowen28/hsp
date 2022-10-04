package 泛型;

import Collection.List_.ArrayList_;

import java.util.ArrayList;

public class generic_ {


    public static void main(String[] args) {
    //先使用传统方法
        ArrayList arrayList=new ArrayList();
        arrayList.add(new Dog("旺财",10));
        arrayList.add(new Dog("发财",1));
        arrayList.add(new Dog("小黄",20));
      //  arrayList.add(new Cat("花猫",12));
        //遍历
        for (Object o :arrayList) {
            //向下转型
            Dog d1=(Dog)o;
            System.out.println(d1.getName()+";"+d1.getAge());

        }
        System.out.println("+++++++++++++++泛型+++++++++++");
        ArrayList<Dog> arrayList1=new ArrayList<>();
        arrayList1.add(new Dog("旺财",10));
        arrayList1.add(new Dog("发财",1));
        arrayList1.add(new Dog("小黄",20));
        //arrayList1.add(new Cat("花猫",12));//编译器检测出异常，给与提示
        //遍历
        for (Dog o :arrayList1) {
            //向下转型
            System.out.println(o.getName()+";"+o.getAge());

        }


    }
}
/*
*在ArrayList中添加三个Dog对象，Dog对象含有name和age，并输出name和age（要求使用getXX（））
 */
class Dog{
    private String name;
    private int age;

    public Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}
class Cat {
    private String name;
    private int age;

    public Cat(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }


}