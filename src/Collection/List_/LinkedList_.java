package Collection.List_;

public class LinkedList_ {
/*
* LinkedList实现双向链表和双端队列的特点
* 可以添加任意元素（可重复），和null
* 线程不安全，没有实现同步
*
* */
    public static void main(String[] args) {
        //模拟一个简单的双向链表

        //先创建节点
        Node jack=new Node("jack");
        Node tom=new Node("tom");
        Node hsp=new Node("hsp");
        //连接节点
        jack.next=tom;
        tom.next=hsp;
        hsp.pre=tom;
        tom.pre=jack;

        Node first=jack;//让first指向jack，就是双向列表的头结点
        Node last=hsp;//让last指向hsp，就是双向列表的尾结点

        //插入数据
        //1.先创建要添加数据的节点
        Node smith=new Node("smith");
        smith.next=hsp;
        smith.pre=tom;
        tom.next=smith;
        hsp.pre=smith;



        //演示遍历
        while (true){
            if (first==null) {
                break;
            }
            //输出信息
            System.out.println(first);
            first=first.next;
        }

        System.out.println("============");
        //删除
       first=jack;
     tom.pre.next=tom.next;
     tom.next.pre=tom.pre;
        //演示遍历
        while (true){
            if (first==null) {
                break;
            }
            //输出信息
            System.out.println(first);
            first=first.next;
        }

    }
}

//定义一个Node类,Node对象表示一个双向链表的一个节点
class Node{
    public Object iteam;//真正存放数据的地方
    public  Node pre;//指向前一个节点
    public Node next;//指向下呀一个节点
    public Node(Object name){
        this.iteam=name;
    }
    public String toString(){
        return "Node name\t"+iteam;
    }

}
