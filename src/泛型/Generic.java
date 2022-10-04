package 泛型;

        //泛型类
        /*
        * <T>泛型标识-类型形参
        * <T>创建对象时指定具体类型
        * 泛型不支持基本类型
        * */
public class Generic<T>{
        private T key;//定义泛型变量

    public Generic(T key) {
        this.key = key;
    }

    public T getKey() {
        return key;
    }

    public void setKey(T key) {
        this.key = key;
    }

    @Override
    public String toString() {
        return "Generic{" +
                "key=" + key +
                '}';
    }
}
