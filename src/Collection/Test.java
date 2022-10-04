package Collection;

import String类.Str;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Test {

    public static void main(String[] args) {
        List list=new ArrayList();
        list.add(new Dog("小黄",5));
        list.add(new Dog("小黑",7));
        list.add(new Dog("小兰",3));
        //增强for
        for (Object o :list) {
            System.out.println(o);
        }
        System.out.println("======================");
        //iterator
        Iterator iterator=list.iterator();
        while (iterator.hasNext()) {
            Object next =  iterator.next();
            System.out.println(next);
        }

    }
}
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

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}