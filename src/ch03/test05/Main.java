package ch03.test05;
/*
연속된 자연수의 합
N입력으로 양의 정수 N이 입력되면 2개 이상의 연속된 자연수의 합으로
정수 N을 표현하는 방법의 가짓수를 출력하는 프로그램을 작성하세요.

만약 N=15이면
7+8=15
4+5+6=15
1+2+3+4+5=15


 */
import java.util.Scanner;

public class Main {

    public static int solution(int n){
        int answer =0;
        int sum=0;
        int lt=1;


        for(int i=1; i<n; i++){
            sum+=i;
            if(sum==n){
                answer++;
            }while(sum>n){
                sum-=lt;
                lt++;
                if(sum==n){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        System.out.println(solution(n));

    }
}
