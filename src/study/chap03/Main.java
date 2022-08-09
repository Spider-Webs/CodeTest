package study.chap03;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n=scanner.nextInt();
        int count=0;
        int answer=n;

        int a=0;
        int b=0; int sum=0;
        while(true){
            a=answer/10;
            b=answer%10;

            sum=a+b;
            if(sum<10) {
                answer = b * 10 + sum;
            }else{
                int c=sum/10;
                int d=sum%10;
                answer = b * 10 + d;
            }
            count++;
            if(n==answer){
                break;
            }
        }

        System.out.println(count);
    }
}
