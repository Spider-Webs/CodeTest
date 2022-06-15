package baekjun_string.test07;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int sum=0;
        int answer=0;
        int[] arr = new int[5];

        for(int i=0; i<5; i++){
            arr[i]= scanner.nextInt();
        }

        for(int i=0; i<5; i++){
            sum += arr[i] * arr[i];
        }
        answer=sum%10;
        System.out.println(answer);

    }
}
