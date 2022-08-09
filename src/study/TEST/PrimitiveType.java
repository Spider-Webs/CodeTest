package study.TEST;


import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

class Data {
    int x;
}
public class PrimitiveType {

    public static void main(String[] args) {
        Data data = new Data();
        data.x=10;
        System.out.println("main : " + data.x);
        change(data.x);
        System.out.println("After change");
        System.out.println("main : " + data.x);
        ArrayList list = new ArrayList();

    }


    static void change(int x){
        x=20;
        System.out.println("change : " + x);
    }

}
