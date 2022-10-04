package System;

import java.util.stream.StreamSupport;

public class system01 {
    public static void main(String[] args) {
            //退出程序
        System.out.println("exit 01");
     //   System.exit(0);//exit(0)表示程序退出，0表示一个状态，正常状态9
        System.out.println("exit 02");

        //arraycopy():复制数组，一般情况使用Arrays.copyof();
        int[] src={1,2,3};
        int[] dest=new int[3];//默认[0,0,0]
        System.arraycopy(src,0, dest,0,3);
        /*
        *   src:表示原数组
        *   srcPos:从原数组哪个位置开始拷贝
        *   dest:目标数据，即把原数组要拷贝到的数组
        *   destPos:把原数组的数据拷贝到目标数组的指定位置
        *   length:从原数组拷贝多少个数据
        * */

        //currentTimeMilles:返回当前日期到1970-01-01的毫秒数
      long t=System.currentTimeMillis();
        System.out.println(t);

    }
}
