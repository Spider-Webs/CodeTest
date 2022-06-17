package baekjun_string.test13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String str = scanner.next();

        int[] arr = new int[26];

        for(int i=0; i< str.length(); i++){
            int n = str.charAt(i)-'a';

            arr[n]++;

        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }
    }
}
