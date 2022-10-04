package 泛型;

public class ProductMain {
    public static void main(String[] args) {
        //创建抽奖机对象
        ProductGetter<String> pro=new ProductGetter<>();
        String[] arr={"苹果手机","小米手环","华为手机","空调","电扇"};
        //添加奖品
        for (int i = 0; i <arr.length ; i++) {
            pro.addproduct(arr[i]);
        }
        //获取奖品
        String getpro= pro.getProduct();
        System.out.println(getpro);
        System.out.println("===========cash==============");
        int[] money={200,30000,256,3435,65432,1,7,10000000};
        ProductGetter<Integer> prom=new ProductGetter<>();
        for (int i = 0; i <money.length ; i++) {
            prom.addproduct(money[i]);
        }
        int m=prom.getProduct();
        System.out.println(m);
    }
}
