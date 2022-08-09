package study.TEST;

class Data2 {
    int x;
}
public class ReferenceType {

    public static void main(String[] args) {
        Data2 data2 = new Data2();

        data2.x=10;
        System.out.println("main : " + data2.x);
        change(data2);
        System.out.println("After change");
        System.out.println("main : " + data2.x);
    }
    static void change(Data2 data2){
        data2.x=20;
        System.out.println("change : " + data2.x);
    }
}
