package ch02_array.test09;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] arr = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                arr[i][j] = scanner.nextInt();
            }
        }

        int sum1=0;
        int sum2=0;
        int max=0;
        for(int i=0; i<n; i++){
            sum1=0;
            sum2=0;
            for(int j=0; j<n; j++){
                sum1 += arr[i][j];
                sum2 += arr[j][i];
            }
            max=Math.max(sum1, max);
            max = Math.max(sum2, max);
        }


        sum1=0;
        sum2=0;
        for(int i=0; i<n; i++){
            sum1+=arr[i][i];
            sum2 += arr[n - 1][i];
        }
        max = Math.max(sum1, max);
        max = Math.max(sum2, max);

        System.out.println(max);
    }
}
