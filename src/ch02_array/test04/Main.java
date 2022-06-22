package ch02_array.test04;
/*
피보나치수열
설명

1) 피보나키 수열을 출력한다. 피보나치 수열이란 앞의 2개의 수를 합하여 다음 숫자가 되는 수열이다.

2) 입력은 피보나치 수열의 총 항의 수 이다. 만약 7이 입력되면 1 1 2 3 5 8 13을 출력하면 된다.


입력
첫 줄에 총 항수 N(3<=N<=45)이 입력된다.


출력
첫 줄에 피보나치 수열을 출력합니다.

ex)
10   -> 1 1 2 3 5 8 13 21 34 55
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        scanner.close();

        int[] arr = new int[n];
        int a= 1;
        int b =1;
        arr[0]=a;
        arr[1]=b;
        for(int i=2; i<n; i++){
            arr[i] = arr[i - 1] + arr[i - 2];
        }
        for (int i : arr) {
            System.out.print(i+" ");

        }

    }
}
