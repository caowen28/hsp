package 异常;

public class Throw {

    public static void main(String[] args) {

            Throw.age(-20);

        System.out.println("end");
    }
    public static void age(int age){
        if (age<0||age>120) {
            throw new RuntimeException("你输出的age不在0~120之间 ");
        }
    }
}
