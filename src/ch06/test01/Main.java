package ch06.test01;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> solution(int n, int[] arr){
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(arr);
        for(int i=0; i<n; i++){
            answer.add(arr[i]);
        }

        return answer;
    }


    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scan.nextInt();
        }

        for(int i : solution(n,arr)){
            System.out.print(i+" ");
        }
    }
}
