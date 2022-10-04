package 线程.Method;

public class Method {

    public static void main(String[] args) throws InterruptedException{
        T t=new T();
        t.setName("hsp");
        t.setPriority(Thread.MIN_PRIORITY);
        t.start();
        System.out.println(t.getName());

        //主线程打印5个hi，然后就中断子线程的休眠
        for (int i = 0; i <5 ; i++) {
            Thread.sleep(1000);
            System.out.println("hi"+i);
        }
        t.interrupt();//当执行到这里时就会中断t的休眠

    }
}
class T extends Thread{
    @Override
    public void run() {
        for (int i = 0; i <100 ; i++) {

            System.out.println(Thread.currentThread().getName()+"吃包子"+i);
        }  try {
            System.out.println("休眠中");
            Thread.sleep(20000);
        } catch (InterruptedException e) {
            System.out.println("老韩吃包子被中断了");
        }

    }
}
