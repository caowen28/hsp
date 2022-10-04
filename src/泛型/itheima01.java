package 泛型;

import String类.Str;

import java.util.ArrayList;

public class itheima01 {

    public static void main(String[] args) {
        //不加泛型
//        ArrayList arrayList=new ArrayList();
//        arrayList.add("jack");
//        arrayList.add(100);
//        arrayList.add('a');
//        for (int i = 0; i <arrayList.size() ; i++) {
//            //Object o=arrayList.get(i);
//            String s=arrayList.get(i);//此时会报错，类型转化异常
//        }

        //使用泛型：编译期间检查类型
        //      减少数据类型转化
        ArrayList<String> arrayList1=new ArrayList<>();
        arrayList1.add("kaco");//此时集合只能添加string类型
        arrayList1.add("jack");
        arrayList1.add("rose");
        for (int i = 0; i <arrayList1.size() ; i++) {
            String s=arrayList1.get(i);
            System.out.println(s);
        }

    }
}
