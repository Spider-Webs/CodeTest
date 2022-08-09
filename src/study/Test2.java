package study;

import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) throws Exception {
        ArrayList<Integer> list = new ArrayList<>(10);
        for (int i = 0; i < 50; i++) {
            list.add(i);
            System.out.format("Size: %2d, Capacity: %2d%n", list.size(), getCapacity(list));
        }
    }

    static int getCapacity(ArrayList<?> l) throws Exception {
        Field dataField = ArrayList.class.getDeclaredField("elementData");
        dataField.setAccessible(true);
        return ((Object[]) dataField.get(l)).length;
    }

    /* 결과값
        Size:  1, Capacity:  3
        Size:  2, Capacity:  3
        Size:  3, Capacity:  3
        Size:  4, Capacity:  4
        Size:  5, Capacity:  6
        Size:  6, Capacity:  6
        Size:  7, Capacity:  9
        Size:  8, Capacity:  9
        Size:  9, Capacity:  9
        Size: 10, Capacity: 13
    */

}
