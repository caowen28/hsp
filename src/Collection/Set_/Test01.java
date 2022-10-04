package Collection.Set_;

import java.util.HashSet;
import java.util.Objects;

public class Test01 {
    /*
    * 定义一个employee类，该类包含name，age
    * 要求：创建3个employee对象放入HashSet中
    * 当name和age相同时认为是相同员工不能添加到hashset中
    *
    * */
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(new Employee("milan",18));
        hashSet.add(new Employee("jack",21));
        hashSet.add(new Employee("milan",18));
        System.out.println(hashSet);


    }
}
class Employee{
    private String name;
    private int age;

    public Employee(String name, int age) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return age == employee.age && Objects.equals(name, employee.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}