package Collection.Set_;

public class HsahSetStruct {
        public static void main(String[] args) {
                //模拟HashSet底层(HashMap的底层)

                //创建一个数组，数组类型是node[]
                Node[] table=new Node[16];
                System.out.println("table="+table);

                //创建节点
                Node john=new Node("john",null);
                Node lucy=new Node("lucy",null);
                //将节点放在table下标为2的数组内
                table[2]=john;
                Node jack=new Node("jack",null);
                john.next=jack;//将jack节点挂载到john
                table[3]=lucy;
                System.out.println("table="+table);




        }
}
class Node{//创建节点存储数据，可以指向下一个节点。从而形成链表
        Object item;//存放数据
        Node next;//指向下一个节点

        public Node(Object item, Node next) {
                this.item = item;
                this.next = next;
        }
}