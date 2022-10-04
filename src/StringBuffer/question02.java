package StringBuffer;

public class question02 {
    public static void main(String[] args) {
        /*输入商品价格要求 价格的小数点前每三位用逗号隔开*/
        String price="123456.78";
        StringBuffer sb=new StringBuffer(price);
     //   int i=sb.lastIndexOf(".");
       // sb=sb.insert(i-3,",");
        for(int j=sb.lastIndexOf(".")-3;j>0;j-=3){
            sb.insert(j,",");
        }
        System.out.println(sb);
    }
}
