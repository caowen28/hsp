package 线程.创建线程的两种方式;

public class Thread02 {
        /*
        * 通过实现runnable接口创建线程
        * 底层使用设计模式：静态代理模式
        * */
    public static void main(String[] args) {
        Dog dog=new Dog();
        //dog.start();这里不能调用start()方法
        Thread thread=new Thread(dog);
        thread.start();

    }
}
//线程代理类
class proxy implements Runnable{
    private Runnable target=null;
    public void run(){
        if(target!=null){
            target.run();
        }
    }

    public proxy(Runnable target) {
        this.target = target;
    }
    public void start(){
        start0();
    }
    public void start0(){
        run();
}
}


class Dog implements Runnable{
    int count=0;
    public void run(){
        while(count<=10){
            System.out.println("小狗汪汪叫"+(++count)+Thread.currentThread().getName());
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

        }