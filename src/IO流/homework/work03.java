package IO流.homework;

import org.junit.Test;

import java.io.*;
import java.util.Properties;

/*
* 编写dog.properties
* name=tom
* age=5
* color=red
* 编写dog类（name,age,color)创建dog对象读取dog.properties用相应的内容完成属性初始化并输出
* 将dog对象序列化到文件dog.dat文件
*
* */
public class work03 {

    public static void main(String[] args) throws Exception{
    //创建properties对象
        Properties properties=new Properties();
        //添加数据
        properties.setProperty("name","tom");
        properties.setProperty("age","5");
        properties.setProperty("color","red");
        //保存到磁盘
        properties.store(new FileOutputStream("src\\dog.properties"),null);
        System.out.println("保存成功");
        //==========读取---------
        properties.load(new FileReader("src\\dog.properties"));
        //将内容显示到控制台
        properties.list(System.out);
        System.out.println(properties.getProperty("name"));
        System.out.println(properties.getProperty("age"));
        System.out.println(properties.getProperty("color"));

        //将dog对象序列化
        String src="d:\\dog.dat";
        Dog dog=new Dog("tom",3,"red");
        ObjectOutputStream oos=new ObjectOutputStream(new FileOutputStream(src));
        oos.writeObject(dog);
        oos.close();




    }
    @Test
    //反序列化
    public void $ser()throws Exception{
        String aimed="d:\\dog.dat";
        ObjectInputStream obj=new ObjectInputStream(new FileInputStream(aimed));
        Dog dog1=(Dog)obj.readObject();
        System.out.println(dog1);
        obj.close();
    }
}

class Dog implements Serializable {
    private String name;
    private int age;
    private String color;

    public Dog(String name, int age, String color) {
        this.name = name;
        this.age = age;
        this.color = color;
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

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}