package ch05.test03;

import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static int solution( int[][] a, int[] b){
        int answer =0;

        Stack<Integer> st = new Stack<>();
        for(int x : b){
            int s = x-1;
            for(int i=0; i<a.length; i++){
                if(a[i][s]!=0){
                    if(!st.isEmpty()&&st.peek()==a[i][s]){
                        answer+=2;
                        st.pop();
                    }else {
                        st.push(a[i][s]);

                    }

                    a[i][s]=0;
                    break;
                }
            }
        }

        return answer;
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int[][] a = new int[n][n];

        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                a[i][j] = scanner.nextInt();
            }
        }

        int m = scanner.nextInt();
        int[] b = new int[m];
        for(int i=0; i<m; i++){
            b[i] = scanner.nextInt();

        }
        System.out.println(solution(a,b));
    }
}
