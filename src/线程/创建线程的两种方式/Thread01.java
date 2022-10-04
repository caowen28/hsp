package 线程.创建线程的两种方式;

public class Thread01 {
        /*
        * 通过继承Thread类创建线程
        * */


    public static void main(String[] args) throws InterruptedException{//主线程启动
    Cat cat=new Cat();//cat的线程名thread-01
    cat.start();//启动线程
        /*
        真正实现多线程的效果是start0（）而不是run
            start源码
        * （1）public synchronized void start(){
                        strat0();
                        }
            (2)
            //start0()是本地方法，jvm调用，底层是c/c++实现
            private native void start0();

        * */

        System.out.println("主线程继续执行："+Thread.currentThread().getName());//获取主线程名主
        for (int i = 0; i <30; i++) {
            System.out.println("主线程 i="+i);
            //让主线程休眠1秒
            Thread.sleep(1000);
        }


    }
}

//当一个类继承了thread类，该类可以作为一个线程使用
//thread类实现了runnable接口的run方法
class Cat extends Thread{
    int times=1;
    public void run(){
        while(times<=80) {
            //该线程每隔一秒输出”喵喵，我是一只小猫咪“
            System.out.println("子线程\t喵喵，我是一只小猫咪"+times++);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException i) {
                i.printStackTrace();
            }
        }
    }
}