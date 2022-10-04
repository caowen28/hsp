package 泛型.子类;

@SuppressWarnings({"all"})
//子类是泛型，子类的泛型标识要和父类的泛型标识一致
public class Child01<T> extends Parent<T>{
    public T getValue(){
            return super.getValue();
        }

}
