package study.TEST;

import java.util.ArrayList;
import java.util.List;

public class GenTest {

    public static void main(String[] args) {
        ArrayList<Tv> tv = new ArrayList<>();
        tv.add(new Tv("삼성"));
        tv.add(new Tv("LG"));

        ArrayList<Audio> audio = new ArrayList<>();
        audio.add(new Audio("오디오"));
        ArrayList<Fruit> f = new ArrayList<>();
        printAll(tv,audio);
        printAll2(audio,audio);//컴파일 오류
    }

    public static void printAll(ArrayList<? extends Product> list, ArrayList<? extends Product> list2) {
        for (Product product : list) {
            System.out.println("list1 : "+product);
        }

        for (Product product : list2) {
            System.out.println("list2 : "  + product );
        }
    }

    public static <T extends Product> void printAll2(ArrayList<T> list3, ArrayList<T> list4) {
        for (Product product : list3) {
            System.out.println("list3 : "+product);
        }

        for (Product product : list4) {
            System.out.println("list4 : "  + product );
        }
    }
}

class Product {

}

class Tv extends Product {
    String tv;

    public Tv(String tv) {
        this.tv = tv;
    }

    public String getTv() {
        return tv;
    }
}

class Audio extends Product{
    String audio;

    public Audio(String audio) {
        this.audio = audio;
    }

    public String getAudio() {
        return audio;
    }
}

class Fruit{

}
