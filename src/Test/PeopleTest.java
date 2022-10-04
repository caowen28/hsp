package Test;

public class PeopleTest {
    public static void main(String[] args) {
        Person p=new Person();
        p.name="hsp";
        if(p.name instanceof String){
            System.out.println("true");
        }
    }
}
