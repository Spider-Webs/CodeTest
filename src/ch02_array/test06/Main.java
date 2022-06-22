package ch02_array.test06;
/*
뒤집은 소수
설명
N개의 자연수가 입력되면 각 자연수를 뒤집은 후 그 뒤집은 수가 소수이면 그 소수를 출력하는 프로그램을 작성하세요.
단 910를 뒤집으면 19로 숫자화 해야 한다.
첫 자리부터의 연속된 0은 무시한다.

입력
첫 줄에 자연수의 개수 N(3<=N<=100)이 주어지고, 그 다음 줄에 N개의 자연수가 주어진다.

각 자연수의 크기는 100,000를 넘지 않는다.

출력
첫 줄에 뒤집은 소수를 출력합니다. 출력순서는 입력된 순서대로 출력합니다.

ex)
9
32 55 62 20 250 370 200 30 100   -> 23 2 73 2 3
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
        int[] arr = new int[n];

        List<Integer> list = new ArrayList<>();

        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
            String s = String.valueOf(arr[i]);


            int lt = 0;
            int rt = s.length()-1;
            char[] c = s.toCharArray();
            while (lt<rt){
                char tmp = c[lt];
                c[lt]=c[rt];
                c[rt]=tmp;
                lt++;
                rt--;
            }
            int i1 = Integer.parseInt(String.valueOf(c));

            if(solution(i1)==true){
                list.add(i1);
            }
        }

        for (Integer integer : list) {
            System.out.print(integer+ " ");

        }

    }
}
