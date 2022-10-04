package Collection.List_;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayList_ {
    public static void main(String[] args) {
        List list=new ArrayList();//创建arraylist集合
        //add()
        list.add("jack");//添加元素
        list.add(20);//list.add(new Integer(20))--对象
        list.add(true);
        System.out.println("list.add="+list);

        //remove（）
        list.remove(0);//删除指定位置的元素
        list.remove(true);//删除某个元素对象
        System.out.println("list.remove="+list);

        //contains()查找元素是否存在
        System.out.println(list.contains("jack"));//true

        //size
        System.out.println("list.size="+list.size());

        //isEmpty()
        System.out.println("list.isempty="+list.isEmpty());

        //clear
        list.clear();
        System.out.println("list.clear="+list);

        //addAll
        List list2=new ArrayList();
        list2.add("红楼梦");
        list2.add("三国演义");
        list.addAll(list2);
        System.out.println("list.addAll="+list);

        //containsAll
        System.out.println("list.containsAll="+list.containsAll(list2));

        //removeAll
        list.add("水浒传");
        list.removeAll(list2);
        System.out.println("list.removeall="+list);

        //Iterator迭代器
        Iterator iterator=list.iterator();
        while(iterator.hasNext()){//while循环快捷键 itit 回车
            System.out.println("迭代器遍历="+iterator.next());
        }

        //增强for循环
        for(Object ob:list){//快捷键 I
            System.out.println("增强for="+ob);
        }


    }
}
