package 异常;

public class ReturnException {
    static void methodA(){//methodA
        try {
            System.out.println("进入A方法");
            throw new RuntimeException("异常制造");
        }finally {
            System.out.println("A方法的finally");
        }
    }

    static void methodB(){//methodB
        try {
            System.out.println("进入B方法");
            return;
        }finally {
            System.out.println("B方法的finally");
        }
    }
     public static void main(String[] args) {
        try{
            ReturnException.methodA();
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
ReturnException.methodB();
    }
}
