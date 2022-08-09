package ch06.test02;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static int[] solution(int n, int[] arr){

        for(int i=0; i<n; i++){
            int idx=i;
            for(int j=i+1; j<n; j++){
                if(arr[idx]>arr[j]){
                    int tmp=arr[idx];
                    arr[idx]=arr[j];
                    arr[j]=tmp;
                }
            }
        }

        return arr;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        for (int i : solution(n, arr)) {
            System.out.print(i+ " ");
        }
    }
}
