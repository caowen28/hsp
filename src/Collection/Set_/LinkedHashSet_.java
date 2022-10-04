package Collection.Set_;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class LinkedHashSet_ {

    /*
    * LinkedHashSet加入顺序和取出元素顺序一致
    * LinkedHashSet底层维护的是LinkedHashMap(HashMap的子类)
    * LinkedHashSet底层结构:数组+双向链表
    * 第一次添加时，直接将数组table扩容到16，存放的节点类型是LinkedHashMap$Entry
    * 数组是HashMap$Node[]存放的元素，数据是LinkedHashMap$Entry类型
    * */



    public static void main(String[] args) {
        Set set=new LinkedHashSet();
        set.add(new String("AA"));
        set.add(456);
        set.add(456);
        set.add(new Customer("jack",20));
        set.add(123);
        set.add("hsp");
        System.out.println("LinkedHashSet="+set);

    }
}
class Customer{
    private String name;
    private int no;

    public Customer(String name, int no) {
        this.name = name;
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", no=" + no +
                '}';
    }
}
