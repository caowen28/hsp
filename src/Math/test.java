package Math;

public class test {
    public static void main(String[] args) {
        int x = 4;
        int y = 5;
        if(x++>4 && ++y>5) {
            x++;
        }
        System.out.println("x="+x+", y="+y);
    }
}
