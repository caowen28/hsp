package 泛型;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class generic02 {

    public static void main(String[] args) {
            //使用hashset放入三个学生对象
        HashSet<Student> hashSet=new HashSet<>();
        hashSet.add(new Student("jack",18));
        hashSet.add(new Student("tom",21));
        hashSet.add(new Student("mary",17));
        //遍历
        for (Student o :hashSet) {
            System.out.println(o);
        }
        //使用hashmap放入三个学生对象
        HashMap<String,Student> hashMap=new HashMap<>();
        hashMap.put("tomm",new Student("tomm",12));
        hashMap.put("smith",new Student("smith",35));
        hashMap.put("hsp",new Student("hsp",12));
        //迭代器
        Set<Map.Entry<String,Student>> entries=hashMap.entrySet();

    }

}
/*
* 创建3个学生对象
* 放到hashset中学生对象
* 放到hashmap中要求key是String name,value是学生对象
* 使用两种方法遍历
* */
class Student{
    private String name;
    private int age;

    public Student(String name, int age) {
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