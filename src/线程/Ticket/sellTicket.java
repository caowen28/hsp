package 线程.Ticket;

public class sellTicket {
            //使用多线程模拟三个窗口
    public static void main(String[] args) {
        sell01 s1=new sell01();
        sell01 s2=new sell01();
        sell01 s3=new sell01();
        //这里会出现超卖的问题
     //   s1.start();
      //  s2.start();
       // s3.start();
        sellTicket02 ss1=new sellTicket02();

        Thread t1=new Thread(ss1);
        t1.start();
        Thread t2=new Thread(ss1);
        t2.start();
        Thread t3=new Thread(ss1);
        t3.start();

    }
}
class sell01 extends Thread{
    private static int ticketnum=100;//让多个线程共享ticketnum
    @Override
    public void run() {
            while (true){
                if(ticketnum<=0){
                    System.out.println("票已售完");
                    break;
                }
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票"+"剩余票数:"+(--ticketnum));
            }
    }
}

class sellTicket02 implements Runnable{
        private  int num=100;
    @Override
    public void run() {
        while(true){
            if(num<=0){
                System.out.println("票已卖完");
                break;
            }
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("窗口"+Thread.currentThread().getName()+"售出一张票，"+"剩余票数:"+(--num));
        }

    }
}