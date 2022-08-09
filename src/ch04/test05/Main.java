package ch04.test05;

import java.util.*;

public class Main {

    public static int solution(int n, int k, int[] arr){
        int answer =-1;
        Set<Integer> set = new TreeSet<>(Collections.reverseOrder());

        int max=0;
        int count =1;
        for(int i=0; i<n; i++){
            for(int j=i+1; j<n; j++){
                for(int s =j+1; s<n; s++){
                    set.add(arr[i] + arr[j] + arr[s]);
                }
            }
        }
        for(int i : set){
            if(count==k){
                answer = i;
                break;
            }
            count++;
        }
        return answer;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int k = scanner.nextInt();

        int[] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i]=scanner.nextInt();
        }
        System.out.println(solution(n,k,arr));
    }
}
