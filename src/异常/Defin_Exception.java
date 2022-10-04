package 异常;

import String类.Str;

public class Defin_Exception {
/*
* 自定义异常步骤;
*       自定义异常类名（自己编写）继承Exception或RuntimeException
*       如果继承Exception，属于编译异常
*       如果继承RuntimeException属于运行时异常
*
* 一般情况下我们把自定义异常设置为runtimeexception，这样可以使用默认处理机制
*
* */
    public static void main(String[] args)throws AgeException{
        int age=180;
       if(age<18||age>120){
           throw new AgeException("你输出的年龄不在18~120之间");
       }
        System.out.println("true");

    }

}
//自定义异常
class AgeException extends Exception{
    public AgeException(String Message) {
        super(Message);
    }
}
