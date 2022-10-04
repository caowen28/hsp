package 泛型.泛型接口;

/*
* 泛型接口的实现类是一个泛型类，那么要保证实现接口的泛型标识要包含泛型接口的泛型标识
*
* */
public class Pair<T,E> implements Generator<T>{
    private T key;
    private E value;

    public Pair(T key, E value) {
        this.key = key;
        this.value = value;
    }

    public T getKey(){
        return key;
    }
    public E getValue(){
        return value;
    }
}
