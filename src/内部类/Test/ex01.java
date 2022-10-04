package 内部类.Test;

public class ex01 {
    public static void main(String[] args) {
        //当作实参直接传递，简洁高效
        f1(new IL() {
            @Override
            public void show() {
                System.out.println("方法1 show time");
            }
        });
        //方法2
        f2();

    }
    //静态方法
    public static void f1(IL il){
            il.show();
    }
    public static void f2(){
        new IL(){
            @Override
            public void show() {
                System.out.println("方法2  show time");
            }
        }.show();
    }
}
//接口
interface IL{
    void show();
}
