package baekjun_string.test1929;
/*
백준 1929
문제
M이상 N이하의 소수를 모두 출력하는 프로그램을 작성하시오.

입력
첫째 줄에 자연수 M과 N이 빈 칸을 사이에 두고 주어진다. (1 ≤ M ≤ N ≤ 1,000,000) M이상 N이하의 소수가 하나 이상 있는 입력만 주어진다.

출력
한 줄에 하나씩, 증가하는 순서대로 소수를 출력한다.
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static boolean solution(int x){
        if(x<2){
            return false;
        }
        for(int i=2; i*i<=x; i++){
            if(x%i==0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int m = scanner.nextInt();

        List<Integer> list = new ArrayList<>();

        for(int i=n; i>=n&&i<=m; i++){
            boolean solution = solution(i);
            if(solution==true){
                list.add(i);
            }
        }
        for (Integer integer : list) {
            System.out.println(integer);
        }

    }

}
