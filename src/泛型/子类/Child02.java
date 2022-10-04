package 泛型.子类;


//泛型类派生子类，如果子类不是泛型类时，父类要指定具体类型
public class Child02 extends Parent<String>{
    @Override
    public String getValue(){
        return super.getValue();
    }
    @Override
    public void setValue(String s){
        super.setValue(s);
    }
}
