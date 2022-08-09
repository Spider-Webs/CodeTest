package study.TEST;

public class ExceptionTest {

    public static void main(String[] args) {

        try {
            System.out.println(1);
            System.out.println(0/0);
            System.out.println(2);
        }catch (ClassCastException e){
            System.out.println(3);
        }finally {
            System.out.println(4);
        }
    }
}
