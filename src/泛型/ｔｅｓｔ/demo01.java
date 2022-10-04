package 泛型.ｔｅｓｔ;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;

public class demo01 {@SuppressWarnings({"all"})

    public static void main(String[] args) {
        //创建集合
        ArrayList<Employee> arrayList=new ArrayList<>();
        arrayList.add(new Employee("hsp",2000,new MyDate(2000,12,31)));
        arrayList.add(new Employee("jack",2003,new MyDate(1972,11,22)));
        arrayList.add(new Employee("rose",2005,new MyDate(2009,01,21)));
        //排序
            arrayList.sort(new Comparator<Employee>() {
                @Override
                public int compare(Employee o1, Employee o2) {
                    //先按照name排序，名字相同按日期排序
                    //先校验
                    if (o1 instanceof Employee && o2 instanceof Employee){
                        System.out.println("对象类型不匹配");
                        return 0;
                    }
                    //比较name
                    int i=o1.getName().compareTo(o2.getName());
                    if(i!=0){
                        return i;
                    }
                    //如果名字相同就比较日期
                    //year
                    int yearminus=o1.getBirthday().getYear()-o2.getBirthday().getYear();
                    if(yearminus!=0){
                        return yearminus;
                    }
                    //month
                    int monthminus=o1.getBirthday().getMonth()-o2.getBirthday().getMonth();
                    if(monthminus!=0){
                        return monthminus;
                    }
                    //day
                    int dayminus=o1.getBirthday().getDay()-o2.getBirthday().getDay();
                    if(dayminus!=0){
                        return dayminus;
                    }

                    return 0;
                }
            });

    }
}
//employee
class Employee{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employee(String name, double sal, MyDate birthday) {
        this.name = name;
        this.sal = sal;
        this.birthday = birthday;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSal() {
        return sal;
    }

    public void setSal(double sal) {
        this.sal = sal;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "\nEmployee{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
//mydate
class MyDate{
    private int year;
    private int month;
    private  int day;

    public MyDate(int year, int month, int day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year=" + year +
                ", month=" + month +
                ", day=" + day +
                '}';
    }
    public int CompareTo(MyDate o){

        //如果名字相同就比较日期
        //year
        int yearminus=year-o.year;
        if(yearminus!=0){
            return yearminus;
        }
        //month
        int monthminus=month-o.getMonth();
        if(monthminus!=0){
            return monthminus;
        }
        //day
        int dayminus=day-o.getDay();
        if(dayminus!=0){
            return dayminus;
        }

        return 0;
    }
}
