package chinese;

public class China {
    private String name;
    private int age;
    static String country="china";//因为中国人的国际都一样，如果设置成实例变量在创建对象时就会浪费空间，设置成static，则为整个类共享

    public China(String name, int age) {
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

    public static String getCountry() {
        return country;
    }

    public static void setCountry(String country) {
        China.country = country;
    }
}
