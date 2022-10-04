package 泛型.泛型方法;

public class demo01 {
    public static void main(String[] args) {
        Car car=new Car();
        car.fly("宝马",20000);//调用方法时，传入参数，编译器会确定类型
        car.fly(20000,"alia");

    }
}

class Car{
    public <T,V> void fly(T t,V v){
        System.out.println(t+","+v);
    }
}
