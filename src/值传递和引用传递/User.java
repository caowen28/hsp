package 值传递和引用传递;
//引用数据类型分为两个部分，引用变量和对象，这两个部分放在不同的地方，
// 引用变量在栈中，而对象是放在堆内存中的，引用变量指向对象。
//当传递参数之前会将参数进行复制，但是复制的是引用变量，复制后的引用变量还是指向内存中的同一对象，
// 所以引用传递中，函数修改了参数会影响实际参数
public class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
    }
    public void f(User u){
        u.setName("尼斯");
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

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
    public static void main(String[] args) {
        User user=new User("张三",12);
        user.f(user);
        System.out.println(user);
    }
}