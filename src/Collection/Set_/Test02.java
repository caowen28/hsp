package Collection.Set_;

import java.util.HashSet;
import java.util.Objects;

public class Test02 {
    /*
    * 定义一个employee类，该类包含name,sal,birthday(MyDate类型)
    * MyDate(year,month,day)
    *
    * 要求:创建三个对象放入hashset中
    * 当name和birthday相同时即认为是同一个员工不能添加到集合中
    * */
    public static void main(String[] args) {
        HashSet hashSet=new HashSet();
        hashSet.add(new Employe("jack",2000,new MyDate("2000","12","31")));
        hashSet.add(new Employe("lucy",1200,new MyDate("1999","05","26")));
        hashSet.add(new Employe("jack",2000,new MyDate("2000","12","31")));
        hashSet.add(new Employe("lucy",1200,new MyDate("1999","07","26")));
        System.out.println(hashSet);
        System.out.println(hashSet.size());

    }
}
class Employe{
    private String name;
    private double sal;
    private MyDate birthday;

    public Employe(String name, double sal, MyDate birthday) {
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employe employe = (Employe) o;
        return Objects.equals(name, employe.name) && Objects.equals(birthday, employe.birthday);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, birthday);
    }

    @Override
    public String toString() {
        return "Employe{" +
                "name='" + name + '\'' +
                ", sal=" + sal +
                ", birthday=" + birthday +
                '}';
    }
}
class MyDate{
    public String year;
    public String month;
    public String day;

    public MyDate(String year, String month, String day) {
        this.year = year;
        this.month = month;
        this.day = day;
    }

    @Override
    public String toString() {
        return "MyDate{" +
                "year='" + year + '\'' +
                ", month='" + month + '\'' +
                ", day='" + day + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MyDate myDate = (MyDate) o;
        return Objects.equals(year, myDate.year) && Objects.equals(month, myDate.month) && Objects.equals(day, myDate.day);
    }

    @Override
    public int hashCode() {
        return Objects.hash(year, month, day);
    }
}