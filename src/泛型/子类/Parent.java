package 泛型.子类;

public class Parent<E> {
    private E value;
    public E getValue() {
        return value;
    }

    public void setValue(E value) {
        this.value = value;
    }
}
