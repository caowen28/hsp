package 线程.Method;

public class test01 {
        //主线程每隔一秒输出hi，共10次，当输出到第五个时启动子线程（要求实现runnable接口）每隔1秒输出hello，共10次，退出，主线程继续执行
    public static void main(String[] args) throws InterruptedException{
        T3 tt=new T3();
        Thread t=new Thread(tt);
        for (int i = 1; i <=10 ; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
            if(i==5){
                t.start();
                t.join();
            }
        }
    }
}
class T3 implements Runnable{
    @Override
    public void run() {
        for (int i = 1; i <=10 ; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("hello"+i);
        }
    }
}