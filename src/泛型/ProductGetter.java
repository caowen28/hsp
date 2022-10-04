package 泛型;

import java.util.ArrayList;
import java.util.Random;

public class ProductGetter<T> {
        private T product;
        Random random=new Random();//随机获取奖品
        ArrayList<T> arr=new ArrayList<>();//奖品池

        public void addproduct(T t){
            arr.add(t);
        }
        public  T getProduct(){
             product=arr.get(random.nextInt(arr.size()));
             return product;
        }

}
