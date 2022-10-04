package 泛型.泛型方法;

import kotlin.reflect.jvm.internal.impl.renderer.ClassifierNamePolicy;

import java.util.ArrayList;

public class test {

    public static void main(String[] args) {
        ArrayList<String > arrayList=new ArrayList<>();
        arrayList.add("华为手机");
        arrayList.add("苹果手机");
        arrayList.add("汽车");

        ArrayList<Integer> arrayList1=new ArrayList<>();
        arrayList1.add(500);
        arrayList1.add(1000);
        arrayList1.add(20000);
        arrayList1.add(200000);
        ProductGetter<Integer> pro=new ProductGetter();
        System.out.println("+++++++++INTEGER++++++++++");
        Integer product = pro.getProduct();
        System.out.println("INTEGER="+product);



    }
}
