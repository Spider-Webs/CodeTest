package ch02_array.test08;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        List<Integer> list = new ArrayList<>();
        int max=1;
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                if(arr[i]<arr[j]){
                    max++;
                }
            }
            list.add(max);
            max=1;
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");

        }
    }
}
