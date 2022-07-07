package ch03.test02;
/*
A, B 두 개의 집합이 주어지면 두 집합의 공통 원소를 추출하여 오름차순으로 출력하는 프로그램을 작성하세요.

ex)
5
1 3 9 5 2          ->    2 3 5
5
3 2 5 7 8

 */
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> solution(int n, int[] a, int m, int[] b){
        List<Integer> answer = new ArrayList<>();

        Arrays.sort(a);
        Arrays.sort(b);

        int x=0;
        int y=0;

        while (x<n&&y<m){
            if(a[x]==b[y]){
                answer.add(a[x]);
                x++;
                y++;
            }else if(a[x]<b[y]){
                x++;
            }else{
                y++;
            }
        }

        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[] a = new int[n];
        for(int i=0; i<n; i++){
            a[i] = scanner.nextInt();
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();
        }


        for (Integer integer : solution(n,a,m,b)) {
            System.out.print(integer+" ");
        }
    }
}
