package ch03.test04;
/*
연속 부분수열
N개의 수로 이루어진 수열이 주어집니다.
이 수열에서 연속부분수열의 합이 특정숫자 M이 되는 경우가 몇 번 있는지 구하는 프로그램을 작성하세요.
만약 N=8, M=6이고 수열이 다음과 같다면
1 2 1 3 1 1 1 2
합이 6이 되는 연속부분수열은 {2, 1, 3}, {1, 3, 1, 1}, {3, 1, 1, 1}로 총 3가지입니다.

ex)
8 6                     ->             3
1 2 1 3 1 1 1 2
 */
import java.util.Scanner;

public class Main {

    public static int solution(int n, int m, int[] arr){
        int answer = 0;
        int sum=0;
        int lt=0;

        for(int rt=0; rt<n; rt++){
            sum += arr[rt];
            if(sum==m){
                answer++;
            }
            while(sum>=m){
                sum -= arr[lt];
                lt++;
                if(sum==m){
                    answer++;
                }
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] arr = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        System.out.println(solution(n,m,arr));
    }
}
