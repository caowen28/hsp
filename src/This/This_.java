package This;

public class This_ {
    private  String name;//此时的变量为实例变量（不用static修饰的）必须通过对象去访问
    private  int age;

    public This_(){
        this("张三",10);//在无参构造器中调用其他构造方法
    }
    public This_(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
