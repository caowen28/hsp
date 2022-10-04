package 泛型.泛型接口;
/*
* 实现泛型接口的类不是泛型类，需明确泛型接口的数据类型
*
* */
public class Apple implements Generator<String>{
public String getKey(){
    return "hello";
}

}
