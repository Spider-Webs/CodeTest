package ch06.test03;

import java.util.Scanner;

public class Main {

    public static int[] solution(int n, int[] arr){

        for(int i=0; i<n; i++){
            int tmp = arr[i],j=0;
            for(j=i-1; j>=0; j--){
                if(tmp<arr[j]){
                    arr[j+1]=arr[j];
                }else{
                    break;
                }
            }
            arr[j+1]=tmp;
        }

        return arr;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] arr = new int[n];

        for(int i=0; i<n; i++) {
            arr[i] = scanner.nextInt();

        }
        for (int i : solution(n,arr)) {
            System.out.print(i+" ");
        }
    }
}
