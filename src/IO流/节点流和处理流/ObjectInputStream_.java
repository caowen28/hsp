package IO流.节点流和处理流;

import jdk.swing.interop.SwingInterOpUtils;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

/*
* 将文件进行反序列化
* */
public class ObjectInputStream_ {

    public static void main(String[] args) throws Exception{
        //指定反序列化文件位置
            String filePath="D:\\data.dat";
        ObjectInputStream ois=null;
        ois=new ObjectInputStream(new FileInputStream(filePath));
        //反序列化顺序要和序列化顺序一致
        System.out.println(ois.readInt());
        System.out.println(ois.readBoolean());
        System.out.println(ois.readChar());
        System.out.println(ois.readDouble());
        System.out.println(ois.readUTF());
        Object o=ois.readObject();
        System.out.println("运行类型="+o.getClass());
        System.out.println("dog="+o);
        Dog dog=(Dog)o;
        System.out.println(dog.getName());
        //关闭流
        ois.close();
        //特别重要的细节
        //如果我们希望调用Dog的方法需要向下转型
        //需要我们将Dog类的定义，拷贝到可以引入的位置




    }
}
