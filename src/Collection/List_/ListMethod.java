package Collection.List_;

import java.util.ArrayList;
import java.util.List;

public class ListMethod {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("张三丰");
        list.add("贾宝玉");

        //void add(int index,Object obj) 在index位置插入元素
        list.add(1,"刘备");

        //boolean adAll(int index,Collection co) 从index位置添加co集合中所有元素
        List list1=new ArrayList();
        list1.add("老大爷");
        list1.add("大熊");
        list.addAll(2,list1);//在下标为2的位置插入集合中所有元素

        //Object get(int index);获取index位置的元素
        System.out.println(list.get(1));

        //int indexOf(Object obj)返回obj在集合中首次出现的位置
        System.out.println(list.indexOf("老大爷"));

        //int lastIndexOf(Object obj)返回obj在集合中最后出现的位置
        System.out.println(list.lastIndexOf("大熊"));

        //Object remove(int index)删除index位置的元素并返回该元素
       list.remove(0);

        //object set(int index ,Object obj)设置index位置的索引，相当于替换
        list.set(2,"胡歌");

        //List subList(int fromIndex ,int  toIndex)返回从下标fromindex（包含）到toindex（不包含）位置的元素
        System.out.println(list.subList(0,3));
        System.out.println(list);










    }
}
