package ch03.test01;
/*
두 배열 합치기
오름차순으로 정렬이 된 두 배열이 주어지면 두 배열을 오름차순으로 합쳐 출력하는 프로그램을 작성하세요.


예시 입력          예시 출력
3
1 3 5             1 2 3 3 5 6 7 9
5
2 3 6 7 9
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static List<Integer> solution(int n, int[] a, int m, int[] b){
        List<Integer> answer = new ArrayList<>();
        int i=0;
        int x =0;
        int y=0;

        while(x<n&&y<m){
            if(a[x]<b[y]){
                answer.add(a[x]);
                x++;
            }else if(a[x]>b[y]){
                answer.add(b[y]);
                y++;
            }else{
                answer.add(a[x]);
                answer.add(b[y]);
                x++;
                y++;
            }
        }

        while(x<n) answer.add(a[x++]);
        while(y<m) answer.add(b[y++]);

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

        for(int i=0; i<b.length; i++){
            b[i] = scanner.nextInt();
        }

        String s = "asd adas";
        String[] s1 = s.split(" ");

        for (Integer integer : solution(n,a,m,b)) {
            System.out.print(integer+ " ");
        }
    }
}
