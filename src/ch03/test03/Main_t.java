package ch03.test03;

/*
정답
최대 매출
N일 동안의 매출기록을 주고 연속된 K일 동안의 최대 매출액이 얼마인지 구하라고 했습니다.

만약 N=10이고 10일 간의 매출기록이 아래와 같습니다. 이때 K=3이면

12 15 11 20 25 10 20 19 13 15

연속된 3일간의 최대 매출액은 11+20+25=56만원입니다.
 */

import java.util.Scanner;

public class Main_t {
    public static int solution(int n, int k,int[] arr) {

        int answer =0;
        int sum =0;
        for(int i=0; i<k; i++) {
            sum += arr[i];
        }
        answer=sum;

        for(int i=k; i<n; i++) {
            sum += (arr[i] - arr[i - k]);
            answer = Math.max(answer, sum);
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
