package 线程.创建线程的两种方式;

public class Thread3 {
    /*
    * 在main方法中创建两个子线程
    * */
    public static void main(String[] args) {
            T1 t1=new T1();
            T2 t2=new T2();
            Thread thread1=new Thread(t1);
            Thread thread2=new Thread(t2);
            thread1.start();
            thread2.start();
    }
}

class T1 implements Runnable {
        int count=0;
    public void run(){
        while(count<10){
        //每隔一秒输出”hello world“
        System.out.println("hello world"+count++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }}

}
class T2 implements Runnable{
    int count=0;
    @Override
    public void run() {
        while(count<5){
        //每隔1秒输出 hi，输出五次
        System.out.println("hi"+count++);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}}