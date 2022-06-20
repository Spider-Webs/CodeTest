package baekjun_string.test;
/*
백준 4375
문제
2와 5로 나누어 떨어지지 않는 정수 n(1 ≤ n ≤ 10000)가 주어졌을 때, 1로만 이루어진 n의 배수를 찾는 프로그램을 작성하시오.

입력
입력은 여러 개의 테스트 케이스로 이루어져 있다. 각 테스트 케이스는 한 줄로 이루어져 있고, n이 주어진다.

출력
1로 이루어진 n의 배수 중 가장 작은 수의 자리수를 출력한다.

ex)
3           3
7       ->  6 
9901        12
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        //테스트 케이스의 갯수가 주어있지않으므로 while문을 반복한다
        while (sc.hasNextInt()) {
            int n = sc.nextInt();
            //1로만 이루어진 배수를 찾기위한변수, 1로반 이루어졌다는건  1로 나누었을때 나머지가 0인것을 의미한다
            int num = 0;
            //무한복을해주고 조건의 해당되면 break; 하면된다
            for (int i=1;; i++) {
                /*
                    ex)n=3이라고 가정했을때 1의배수이므로(1,11,111,1111....) num은 다음과 같은 조건이있다.
                    이전 1의배수에 * 10 +1 (0*10+1 num=1, num(1)*10+1=11 num=11...)
                    num = num%n; 0이되는 가장 작은 배수를 확인하면된다 반복되면서 진행되므로 가장작은배수는 조건문이 부합했을 for문에
                    i일것이다 
                 */
                num = num*10+1;
                num %= n;
                if (num == 0) {
                    System.out.println(i);
                    break;
                }
            }
        }
    }
}
