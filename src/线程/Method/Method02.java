package 线程.Method;

public class Method02 {
    public static void main(String[] args)throws InterruptedException {
        T2 t2=new T2();
        t2.start();

        for (int i = 1; i <=20 ; i++) {
            Thread.sleep(1000);
            System.out.println("主线程吃了"+i+"包子");
            if(i==5){
                System.out.println("主线程让子线程先吃完");
            //    t2.join();
                t2.yield();
            }
        }

    }
}
class T2 extends Thread{
    @Override
    public void run() {
        for (int i = 1; i <=20 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("子线程吃了"+i+"个包子");
        }
    }
}
