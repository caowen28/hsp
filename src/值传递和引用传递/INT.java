package 值传递和引用传递;
//值传递：是指在调用函数时，将实际参数复制一份传递到函数中，这样在函数中如果对参数进行修改，就不会影响到实际参数
public class INT {
    public static void main(String[] args) {
        int i=10;
    new INT().f(i);
        System.out.println(i);
    }

    public void f(int num){
        num++;
    }
}
