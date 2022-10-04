package 内部类.Test;

public class ex02 {
    public static void main(String[] args) {

        cellPhone c1=new cellPhone();
        c1.alarmclock(new Bell() {
            @Override
            public void show() {
                System.out.println("懒猪起床了");
            }
        });
        cellPhone c2=new cellPhone();
        c2.alarmclock(new Bell() {
            @Override
            public void show() {
                System.out.println("该去上课了");
            }
        });
    }

}

interface Bell{
    void show();
}
class cellPhone{
    public void alarmclock(Bell bell){
        bell.show();
    }
}