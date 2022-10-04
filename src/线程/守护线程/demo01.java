package 线程.守护线程;

public class demo01 {
    //如何将一个线程设置为守护线程
    public static void main(String[] args) throws InterruptedException {
        MyThread m1=new MyThread();
        m1.setDaemon(true);
        m1.start();
        //如果我们希望main线程结束后，子线程也跟着结束
        //只需要子线程设为守护线程

        for (int i=1;i<=10;i++){
            System.out.println("沸羊羊，呜呜呜呜呜");
            Thread.sleep(1000);

        }
    }
}
class MyThread extends Thread{
    @Override
    public void run() {
        for(;;){
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("喜羊羊，咩咩咩咩咩咩咩咩");
        }
    }
}