package ch06.test04;

import java.util.*;

public class Main {

    public static int[] solution(int n, int m, int[] arr){

        int[] answer = new int[n];

        for(int x: arr){
            int pos=-1;
            for(int i=0; i<n; i++){
                if(x==answer[i]){
                    pos=i;
                }
            }
            if(pos==-1){
                for(int i=n-1; i>=1; i--){
                    answer[i] = answer[i - 1];
                }
            }  else{
                for(int i=pos; i>=1; i--){
                    answer[i] = answer[i - 1];
                }
            }
            answer[0]=x;

        }


        return answer;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        int m = scan.nextInt();
        int[] arr = new int[m];
        for(int i=0; i<m; i++){
            arr[i]=scan.nextInt();
        }
        solution(n, m, arr);
    }
}
