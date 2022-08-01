package ch05.test06;

import java.util.*;

public class Main {

    public static int solution(int n, int k){
        int answer =0;

        Queue<Integer> queue = new LinkedList<>();

        int count =0;
        for(int i=1; i<=n; i++){
            queue.offer(i);
        }

       while (queue.size()>1){
           count++;
           if(count==k){
               queue.poll();
               count=1;
           }
           queue.offer(queue.poll());
       }

        answer = queue.poll();


        return answer;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int k = scanner.nextInt();
        System.out.println(solution(n,k));
    }
}
