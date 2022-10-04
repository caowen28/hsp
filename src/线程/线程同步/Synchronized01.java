package 线程.线程同步;

public class Synchronized01 {
    public static void main(String[] args) {
    sell01 s=new sell01();
    sell01 s1=new sell01();
    sell01 s2=new sell01();
    s.start();
    s1.start();
    s2.start();
        System.out.println(s.getName()+";"+s1.getName()+";"+s2.getName());


    }

}
//使用synchronized方法实现同步
class sell01 extends Thread{
    private static boolean loop=true;
    private static int ticketnum=100;//让多个线程共享ticketnum
    public static synchronized void m(){//同步方法，在某一时刻只能由一个线程来执行
        //此时锁在this对象
        if(ticketnum<=0){
            System.out.println("票已售完");
            loop=false;
            return;
        }
        try {
            Thread.sleep(50);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票"+"剩余票数:"+(--ticketnum));
    }
    @Override
    public  void run() {
        while (loop){
        m();
        }
    }
}