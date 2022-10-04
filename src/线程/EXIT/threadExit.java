package 线程.EXIT;

public class threadExit {
    public static void main(String[] args) {
        T t = new T();
        t.start();
        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        //如果希望main线程去控制t线程的终止，可以选择修改loop
        //让t退出run方法，从而终止t线程--》通知方法
        t.setLoop(false);
    }
}

class T extends Thread{
    private int count=0;
    private boolean loop=true;
    @Override
    public void run() {
        while(loop){
            try {
                Thread.sleep(50);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("T在运行中》》》》》");

        }
    }

    public void setLoop(boolean loop) {
        this.loop = loop;
    }
}