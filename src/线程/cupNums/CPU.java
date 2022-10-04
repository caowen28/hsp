package 线程.cupNums;

public class CPU {
    public static void main(String[] args) {
        Runtime runtime=Runtime.getRuntime();
        //获取当前电脑的cpu数量
        int cpunums= runtime.availableProcessors();
        System.out.println(cpunums);
    }
}
