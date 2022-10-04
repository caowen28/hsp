package Collection.List_;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class List_ {

    public static void main(String[] args) {
        /*
        * List集合添加元素有序可重复
        * list集合都有对应的索引下标从0开始
        * */

        List list=new ArrayList();
        list.add("jack");
        list.add("tom");
        list.add("jack");
        list.add("hsp");
        System.out.println("list="+list);
        System.out.println(list.get(3));//获取下标为3的元素


            List list1=new LinkedList();
            list1.add("hspp");
            list1.add("jack");
            list1.remove("hspp");
        System.out.println(list1);
    }
}
