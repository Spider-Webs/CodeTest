package study.chap03;

import java.util.Arrays;
import java.util.Scanner;

public class Q3_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }

        int key = scanner.nextInt();

        int[] idx = {};

        int num = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == key) {
                idx[num] = i;
                num++;
            }
        }
        System.out.println(idx.length);
    }
}
