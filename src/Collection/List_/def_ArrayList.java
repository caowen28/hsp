package Collection.List_;

import java.util.Arrays;

public class def_ArrayList {
    private Object[] elementDate;
    private int size;
    private static int DEFULT_CAPACITY=10;
    public def_ArrayList(){//设置容器默认内存
       elementDate=new Object[DEFULT_CAPACITY];
    }
    public def_ArrayList(int size){//自定义容器内存
        elementDate=new Object[size];
    }

    public void add(Object o){//添加数据
        elementDate[size++]=o;
    }

    @Override
    public String toString() {
        return elementDate.toString();
    }

    public static void main(String[] args) {
        def_ArrayList arr=new def_ArrayList();
        arr.add("jack");
        arr.add("rose");
        System.out.println(arr);

    }
}
