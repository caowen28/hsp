package 泛型.泛型方法;

import java.util.ArrayList;
import java.util.Random;

public class ProductGetter <T>{
    Random ran=new Random();
    //奖品
    private T product;
    //奖池
    ArrayList<T> arrayList=new ArrayList<>();
    //添加奖品
    public void addproduct(T t){
        arrayList.add(t);
    }
    //抽奖
    public T getProduct(){
        T t=arrayList.get(ran.nextInt(arrayList.size()));
        return  t;
    }

    //定义泛型方法
    public <T> T getProduct(ArrayList<T> arrayList){
        return arrayList.get(ran.nextInt(arrayList.size()));
    }
}
