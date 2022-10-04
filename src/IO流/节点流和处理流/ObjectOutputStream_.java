package IO流.节点流和处理流;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

/*
* 对象流 -ObjectInputStream/ObjectOutputStream
*
*看一个需求:
*   1.将int num=100这个int数据保存到文件中，注意不是100数字，而是int 100，并且能够直接从文件中将其恢复
*   2.将Dog dog=newDog("小黄",3)这个dog对象保存到文件中并且能从文件中恢复
*   3.上面的要求，就是将基本数据类型或对象进行序列化和反序列化操作
*
*
* 序列化和反序列化
* 1.序列化就是在保存数据时，保存数据的值和数据类型
* 2.反布序列化就是在恢复时，恢复数据的值和数据类型
* 3.需要让某个对象支持序列化机制，则必须让其类是可序列化，为了让某个类是可序列化该类必须实现两个接口之一
*       Serialiable  //这是一个标记接口(推荐)
*       Externalizable

* ObjectInputStream提供反序列化功能
* ObjectOutputStream提供序列化功能
*
* 要求:
*  读写顺序要一致
* 要求实现序列化或反序列化对象，需要实现Serializable接口
* 序列化类中建议添加SerialVersionUID提高版本兼容性
* 序列化对象时默认将所有属性都序列化，除了static和transient修饰的成员属性
* 序列化对象时要求里面的属性的类型也要实现序列化接口
* 序列化具备可继承性，如果某类实现了序列化，那么其子类也都实现了序列化
 */
public class ObjectOutputStream_ {

    public static void main(String[] args) throws  Exception{
    //序列化后保存的文件格式不是纯文本格式，而是它自己的格式
        String filePath="D:\\data.dat";
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(filePath));
        //序列化数据到data。dat文件中
        objectOutputStream.writeInt(100);//int->Integer(实现了Serialiable)
        objectOutputStream.writeBoolean(true);//(实现了Serialiable)
        objectOutputStream.writeChar('H');//(实现了Serialiable)
        objectOutputStream.writeDouble(110.01);//(实现了Serialiable)
        objectOutputStream.writeUTF("韩顺平教育");//String(实现了Serialiable)
         //保存一个对象
        objectOutputStream.writeObject(new Dog("小黄",3));
        objectOutputStream.close();
        System.out.println("数据备份完成");


    }

}
class Dog implements Serializable {
    private String name;
    private int age;
    //serivalVersionUID序列化的版本号，提高兼容性 比如在这个dog类中添加新属性，它会是dog类的升级而不会重新创建一个新对象
    public static final long serivalVersionUID=1L;

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