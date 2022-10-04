package 泛型;

public class generic01 {

    public static void main(String[] args) {
        Person<String> person=new Person<>("韩顺平教育");
        /*以上deperson等价于下面代码
        * class Person{
        String s;
         public Person(String s) {
        this.s = s;
         }
        public String f(){
        return  s;
         }
        }
        * */
    }
}

//泛型的作用是：可以在类声明时通过一个标识表示某个属性的类型
//或者是某个方法的返回值类型，或参数类型
class Person<E>{
    E s;//E表示s的数据类型，该数据类型在定义person对象时指定，即在编译期间就确定E是什么类型

    public Person(E s) {
        this.s = s;
    }
    public E f(){
        return  s;
    }
}