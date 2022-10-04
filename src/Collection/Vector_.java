package Collection;

import java.util.Vector;

public class Vector_ {

    //vector与ArrayList基本相同
    public static void main(String[] args) {
        //无参构造
        Vector v=new Vector();
        for(int i=0;i<10;i++){
            v.add(i);
            System.out.println(v.get(i));
        }


    }
}
