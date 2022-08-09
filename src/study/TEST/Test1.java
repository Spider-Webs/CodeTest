package study.TEST;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

public class Test1 {
    public static void main(String[] args) {
        Collection<Integer> collection = new ArrayList<>(Arrays.asList(1,2,3,4));
        Collection<Integer> collection2 = new ArrayList<>(Arrays.asList(2,3));

        System.out.println("before : ");
        for (Integer integer : collection) {
            System.out.print(integer+ " ");
        }

        collection.removeAll(collection2);
        System.out.println('\n'+"after : ");
        for (Integer integer : collection) {
            System.out.print( integer  + " ");
        }

        System.out.println();
        for (Integer integer : collection2) {
            System.out.println(integer);
        }

        System.out.println('\n'+"컬렉션 안의 요소가 비어있니? "+collection.isEmpty());
    }
}
