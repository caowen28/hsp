package 异常;

public class Throw_AND_Throws {
    /*
    * throws ：异常处理的一种方式，位置在方法声明处 后面跟着异常类型，表示抛出异常由方法的调用者处理
    * throws表示可能会抛出异常并不一定会抛出异常
    * throws是方法抛出异常
    *
    *throw是语句抛出异常
    * throw  ：位置处于方法体中，后面跟着异常对象，表示抛出异常由由方法体内的语句处理
    * 如果throw抛出异常则一定出现了某种异常
    *
    * throw自己处理异常，有两种方式：1.要么自己捕获异常try catch 2.要么throw异常
    *
    * 
    * 表示方法内抛出某种异常对象
    *   如果异常对象是非 RuntimeException 则需要在方法申明时加上该异常的抛出 即需要加上 throws 语句 或者 在方法体内 try catch 处理该异常，否则编译报错
    *   执行到 throw 语句则后面的语句块不再执行
    *
    * */
}
