package 泛型.泛型接口;

public interface Generator<T> {
    int n=10;
    //T name;不能这样使用
    public T getKey();
}
