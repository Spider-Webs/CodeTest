package ch03.test03;
/*
내가 푼 문제 시간초과
최대 매출
N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

12 15 11 20 25 10 20 19 13 15

연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 */
import java.util.Scanner;

public class Main {

    public static int solution(int n, int k,int[] arr){
        int answer =0;

        int sum =0;

        int count = 0;
        for(int i=0; i<(n-k)+1; i++) {
            count=i;
            for (int j = 0; j< k; j++) {
                sum += arr[count++];
                if (answer < sum) {
                    answer = sum;
                }
            }
            count++;
            sum=0;
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
