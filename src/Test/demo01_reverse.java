package Test;

import String类.Str;

public class demo01_reverse {
    public static void main(String[] args) {
        //将字符串指定部分反转
        String str="abcdef";
        System.out.println(reverse(str,1,4));
    }
    public static String reverse(String str,int start,int end){
        //验证
        if(!(str!=null&&start>=0&&end<str.length()&&end>start)){
            return "参数错误";
        }

        char[] arr=str.toCharArray();
        char temp=' ';
        for(int i=start,j=end;i<=j;i++,j--){
            temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
        }

        return new String(arr);
    }
}
